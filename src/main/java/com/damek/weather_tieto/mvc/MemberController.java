package com.damek.weather_tieto.mvc;

 import javax.validation.Valid;

import com.damek.weather_tieto.domain.Location;
import com.damek.weather_tieto.repo.LocationDao;
import com.damek.weather_tieto.repo.StateDao;
import com.damek.weather_tieto.repo.WeatherDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/")
public class MemberController
{
    @Autowired
    private StateDao stateDao;
    @Autowired
    private LocationDao locationDao;
    @Autowired
    private WeatherDao weatherDao;

    @RequestMapping(method=RequestMethod.GET)
    public String displaySortedMembers(Model model)
    {
        model.addAttribute("newLocation", new Location());
        model.addAttribute("locations", locationDao.getAllLocationsOrderedByLocation());
        model.addAttribute("status", stateDao.getState());
        return "index";
    }
    
    @RequestMapping(value="newLocation", method=RequestMethod.POST)
    public String registerNewLocation(@Valid @ModelAttribute("newLocation") Location newLocation, BindingResult result, Model model)
    {
        if (!result.hasErrors()) {
            locationDao.register(newLocation);
            return "redirect:/";
        }
        else {
            model.addAttribute("status", stateDao.getState());
            model.addAttribute("newLocation", newLocation);
            model.addAttribute("locations", locationDao.getAllLocationsOrderedByLocation());
            return "index";
        }
    }
  
    @RequestMapping(value="www/weather/{location}")
    public String weatherForLocation(@PathVariable("location") String location, Model model){
    	model.addAttribute("location", location);
    	model.addAttribute("weather", weatherDao.findByLocation(location));
    	return "weather";
    }
}
