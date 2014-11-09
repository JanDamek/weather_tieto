package com.damek.weather_tieto.repo;

import com.damek.weather_tieto.domain.Location;
import com.damek.weather_tieto.domain.State;

public interface StateDao {
	
	public State getState();
	
	public boolean isRequestToWeatherInTimeForLocation(Location location);

	public void weatherServerRequested(Location location);
}
