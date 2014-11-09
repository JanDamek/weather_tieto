package com.damek.weather_tieto.mvc;

import java.util.ArrayList;

import com.damek.weather_tieto.domain.Weather;
import com.damek.weather_tieto.repo.LocationDao;
import com.damek.weather_tieto.repo.WeatherDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/weather")
public class MemberRestController
{
    @Autowired
    private LocationDao locationDao;
	@Autowired
	private WeatherDao weatherDao;
    
    public class Generate_REST_Result {

    	private String location;    	
    	
    	public Generate_REST_Result(String location) {
    		this.location = location;
    	}

    	@SuppressWarnings("unchecked")
    	public <A> A getResult() {
    		if (location == "") {
    			A a = (A) new ArrayList<Weather>();
    			((ArrayList<Weather>) a).addAll(weatherDao.findAllOrderedByLocation());
    			return a;
    		} else {
    			A findWeather = (A) weatherDao.findByLocation(this.location);
    			return findWeather;
    		}

    	}
    }

    @RequestMapping(method=RequestMethod.GET, produces="application/json")
    public @ResponseBody Generate_REST_Result listAllWeather()
    {
    	return new Generate_REST_Result("");
    }

    @RequestMapping(value="/{location}", method=RequestMethod.GET, produces="application/json")
    public @ResponseBody Generate_REST_Result lookupWeatherByLocation(@PathVariable("location") String location)
    {
    	return new Generate_REST_Result(location);
    }
}
