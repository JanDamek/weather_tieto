package com.damek.weather_tieto.domain;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "id"))
public class State {

	@Id
	@NotNull
	private Long id;

	@NotNull
	private int maxCountInMinute = 10;

	@NotNull
	private int maxCountInDay = 500;

	@NotNull
	private int countInLastDayOfYear = 0;

	@NotNull
	private int countInLastMinute = 0;

	@NotNull
	private int lastMinute = 60;

	@NotNull
	private int lastDayOfYear = 368;
	
	@NotNull
	private int maxOldWeatherInMinutes = 30;

	@NotNull
	private Timestamp lastRequest;
	
	public State() {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		id = 0L;
		lastMinute = calendar.get(Calendar.MINUTE);
		lastDayOfYear = calendar.get(Calendar.DAY_OF_YEAR);

		lastRequest = new Timestamp(date.getTime());
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the countInMinute
	 */
	public int getMaxCountInMinute() {
		return maxCountInMinute;
	}

	/**
	 * @param countInMinute
	 *            the countInMinute to set
	 */
	public void setMaxCountInMinute(int countInMinute) {
		this.maxCountInMinute = countInMinute;
	}

	/**
	 * @return the countInDay
	 */
	public int getMaxCountInDay() {
		return maxCountInDay;
	}

	/**
	 * @param countInDay
	 *            the countInDay to set
	 */
	public void setMaxCountInDay(int countInDay) {
		this.maxCountInDay = countInDay;
	}

	/**
	 * @return the lastDayOfYear
	 */
	public int getCountInLastDayOfYear() {
		return countInLastDayOfYear;
	}

	/**
	 * @param countInLastDayOfYear
	 *            the lastDayOfYear to set
	 */
	public void setCountInLastDayOfYear(int countInLastDayOfYear) {
		this.countInLastDayOfYear = countInLastDayOfYear;
	}

	/**
	 * @return the lastMinute
	 */
	public int getCountInLastMinute() {
		return countInLastMinute;
	}

	/**
	 * @param lastMinute
	 *            the lastMinute to set
	 */
	public void setCountInLastMinute(int lastMinute) {
		this.countInLastMinute = lastMinute;
	}

	/**
	 * @return the lastRequest
	 */
	public Timestamp getLastRequest() {
		return lastRequest;
	}

	/**
	 * @param lastRequest
	 *            the lastRequest to set
	 */
	public void setLastRequest(Timestamp lastRequest) {
		this.lastRequest = lastRequest;
	}

	/**
	 * @return the lastMinute
	 */
	public int getLastMinute() {
		return lastMinute;
	}

	/**
	 * @param lastMinute
	 *            the lastMinute to set
	 */
	public void setLastMinute(int lastMinute) {
		this.lastMinute = lastMinute;
	}

	/**
	 * @return the lastDayOfYear
	 */
	public int getLastDayOfYear() {
		return lastDayOfYear;
	}

	/**
	 * @param lastDayOfYear
	 *            the lastDayOfYear to set
	 */
	public void setLastDayOfYear(int lastDayOfYear) {
		this.lastDayOfYear = lastDayOfYear;
	}

	/**
	 * @return the maxOldWeatherInMinutes
	 */
	public int getMaxOldWeatherInMinutes() {
		return maxOldWeatherInMinutes;
	}

	/**
	 * @param maxOldWeatherInMinutes the maxOldWeatherInMinutes to set
	 */
	public void setMaxOldWeatherInMinutes(int maxOldWeatherInMinutes) {
		this.maxOldWeatherInMinutes = maxOldWeatherInMinutes;
	}

}
