package com.damek.weather_tieto.mvc;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.damek.weather_tieto.domain.Weather;
import com.damek.weather_tieto.repo.LocationDao;
import com.damek.weather_tieto.repo.WeatherDao;

@WebService
public class WeatherSoapWebService {

	@Autowired
	private LocationDao locationDao;
	@Autowired
	private WeatherDao weatherDao;

//	public class Generate_SOAP_Result {
//
//		private String location;
//
//		public Generate_SOAP_Result(String location) {
//			this.location = location;
//		}
//
//		@SuppressWarnings("unchecked")
//		public <A> A getResult() {
//			if (location == "") {
//				A a = (A) new ArrayList<Weather>();
//				((ArrayList<Weather>) a).addAll(weatherDao
//						.findAllOrderedByLocation());
//				return a;
//			} else {
//				A findWeather = (A) weatherDao.findByLocation(this.location);
//				return findWeather;
//			}
//
//		}
//	}

	@WebMethod(operationName = "getAllWeathers")
	public List<Weather> getAllWeathers() {
		return weatherDao.findAllOrderedByLocation();
	}

	@WebMethod(operationName = "geWeather")
	public Weather getWeather(String location) {
		return weatherDao.findByLocation(location);
	}
}
