package com.damek.weather_tieto.repo;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.damek.weather_tieto.domain.Location;
import com.damek.weather_tieto.domain.State;

@Repository
@Transactional
public class StateDaoImpl implements StateDao {

	@Autowired
	private EntityManager em;

	private State state = null;

	public State getState() {
		if (state == null) {
			state = em.find(State.class, 0L);
			if (state == null) {
				state = new State();

				em.persist(state);
			}
		}
		return state;
	}

	private long minutesBeatweanRequest() {
		long milliseconds1 = state.getLastRequest().getTime();
		long milliseconds2 = new Date().getTime();

		double diff = milliseconds2 - milliseconds1;
		double diffMinutes = ((diff / (60 * 1000))+0.5);

		return (long)diffMinutes;
	}

	private int minuteIntervalOfDayRequest() {
		return (int)((1440.0 / (double)state.getMaxCountInDay())+0.5);
	}

	private long mitutesBetweanNowAndLocation(Location location) {
		Timestamp last_update = location.getLast_update();
		if (last_update != null) {
			long milliseconds1 = last_update.getTime();
			long milliseconds2 = new Date().getTime();

			long diff = milliseconds2 - milliseconds1;
			double diffMinutes = (diff / (60 * 1000))+0.5;

			return (long)diffMinutes;
		} else
			return state.getMaxOldWeatherInMinutes();
	}

	@Override
	public boolean isRequestToWeatherInTimeForLocation(Location location) {
		boolean is_request_posible = false;
		if (location != null) {

			boolean is_in_limits = (getState().getMaxCountInDay() >= getState()
					.getCountInLastDayOfYear())
					&& (getState().getMaxCountInMinute() >= getState()
							.getCountInLastMinute());

			if (is_in_limits) {
				long intervalOnDay = minuteIntervalOfDayRequest();
				if (minutesBeatweanRequest() >= intervalOnDay) {
					is_request_posible = true;
				}
				if (!is_request_posible) {
					is_request_posible = (mitutesBetweanNowAndLocation(location) >= state.getMaxOldWeatherInMinutes());
				}
			}
		}

		return is_request_posible;
	}

	@Override
	public void weatherServerRequested(Location location) {
		Date date = new Date();
		state.setLastRequest(new Timestamp(date.getTime()));
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		int minute = calendar.get(Calendar.MINUTE);
		int day = calendar.get(Calendar.DAY_OF_YEAR);

		if (minute != state.getLastMinute()) {
			state.setCountInLastMinute(0);
		} else {
			state.setCountInLastMinute(state.getCountInLastMinute() + 1);
		}

		if (day != state.getLastDayOfYear()) {
			state.setCountInLastDayOfYear(0);
		} else {
			state.setCountInLastDayOfYear(state.getCountInLastDayOfYear() + 1);
		}

		state.setLastMinute(minute);
		state.setLastDayOfYear(day);

		em.merge(state);

		location.setLast_update(new Timestamp(date.getTime()));
		em.merge(location);
	}

}
