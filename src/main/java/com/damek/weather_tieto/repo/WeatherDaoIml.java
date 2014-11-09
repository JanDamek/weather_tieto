package com.damek.weather_tieto.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.damek.weather_tieto.domain.Location;
import com.damek.weather_tieto.domain.Weather;
import com.damek.weather_tieto.domain.Weather_;

@Repository
@Transactional
public class WeatherDaoIml implements WeatherDao {

	@Autowired
	private EntityManager em;

	@Override
	public Weather findByLocation(String location) {
		return em.find(Weather.class, location);
	}

	@Override
	public List<Weather> findAllOrderedByLocation() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Weather> criteria = cb.createQuery(Weather.class);
		Root<Weather> weather = criteria.from(Weather.class);

		criteria.select(weather)
				.orderBy(cb.asc(weather.get(Weather_.location)));
		return em.createQuery(criteria).getResultList();
	}

	@Override
	public void setWeather(Location location, Weather weather) {
		if (weather != null) {
			//weather.setLocation(location.getLocation());
			if (em.find(Weather.class, weather.getLocation())!=null) {
				em.merge(weather);
			} else
				em.persist(weather);
		}
	}
}
