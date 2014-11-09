package com.damek.weather_tieto.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.damek.weather_tieto.comunicator.ComunicatorInterface;

/**
 * @author jandamek
 *
 */
@EnableScheduling
public class ScheduledTask {
	   
	@Autowired
    private ComunicatorInterface comunicator;
    
    public void execute() {
    	comunicator.getAllLocations();
    }

}
