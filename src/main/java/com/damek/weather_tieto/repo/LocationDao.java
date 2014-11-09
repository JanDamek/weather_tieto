package com.damek.weather_tieto.repo;

import java.util.List;

import com.damek.weather_tieto.domain.Location;

public interface LocationDao {
	
    public Location findById(String location);
    
	public List<Location> getAllLocationsOrderedByLocation();

	public List<Location> getAllLocationsOrderedbyLastUpdate();

	public void register(Location newLocation);

}
