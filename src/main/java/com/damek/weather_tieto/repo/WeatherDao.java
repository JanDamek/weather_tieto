package com.damek.weather_tieto.repo;

import java.util.List;

import com.damek.weather_tieto.domain.Location;
import com.damek.weather_tieto.domain.Weather;

public interface WeatherDao {

	public Weather findByLocation(String location);

    public List<Weather> findAllOrderedByLocation();

	public void setWeather(Location location, Weather weather);

}
