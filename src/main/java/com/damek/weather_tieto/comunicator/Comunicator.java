/**
 * 
 */
package com.damek.weather_tieto.comunicator;

//import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

//import org.codehaus.jackson.JsonParseException;
//import org.codehaus.jackson.map.JsonMappingException;
//import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.damek.weather_tieto.domain.Location;
import com.damek.weather_tieto.domain.Weather;
import com.damek.weather_tieto.repo.LocationDao;
import com.damek.weather_tieto.repo.StateDao;
import com.damek.weather_tieto.repo.WeatherDao;

/**
 * @author jandamek
 *
 */
@Repository
public class Comunicator implements ComunicatorInterface {

	@Autowired
	private StateDao stateDao;
	@Autowired
	private WeatherDao weaterDao;
	@Autowired
	private LocationDao locationDao;

	private boolean inGettingWeather = false;

//	private final String API = "55adf1bdae3d8f43";
	private final String API = "e60545c235530b39";
	private final String url = "http://api.wunderground.com/api/" + API
			+ "/conditions/q/%s/%s.json";

//	 private String json =
//	 "{\"response\": {	\"version\":\"0.1\",\"termsofService\":\"http://www.wunderground.com/weather/api/d/terms.html\",\"features\": {	\"conditions\": 1}},\"current_observation\": {\"image\": {\"url\":\"http://icons.wxug.com/graphics/wu2/logo_130x80.png\",\"title\":\"Weather Underground\",\"link\":\"http://www.wunderground.com\"},\"display_location\": {\"full\":\"Ostrava, Czech Republic\",\"city\":\"Ostrava\",\"state\":\"\",\"state_name\":\"Czech Republic\",\"country\":\"CZ\",\"country_iso3166\":\"CZ\",\"zip\":\"00000\",\"magic\":\"1\",\"wmo\":\"11782\",\"latitude\":\"49.68000031\",\"longitude\":\"18.12000084\",\"elevation\":\"256.00000000\"},\"observation_location\": {\"full\":\"Lubina, Lubina, NOVY JICIN\",\"city\":\"Lubina, Lubina\",\"state\":\"NOVY JICIN\",\"country\":\"CZECH REPUBLIC\",\"country_iso3166\":\"CZ\",\"latitude\":\"49.610466\",\"longitude\":\"18.165237\",\"elevation\":\"1010 ft\"},\"estimated\": {},\"station_id\":\"INOVYJIC2\",\"observation_time\":\"Last Updated on October 22, 8:16 AM CEST\",\"observation_time_rfc822\":\"Wed, 22 Oct 2014 08:16:21 +0200\",\"observation_epoch\":\"1413958581\",\"local_time_rfc822\":\"Wed, 22 Oct 2014 08:16:23 +0200\",\"local_epoch\":\"1413958583\",\"local_tz_short\":\"CEST\",\"local_tz_long\":\"Europe/Prague\",\"local_tz_offset\":\"+0200\",\"weather\":\"Light Rain\",\"temperature_string\":\"46.6 F (8.1 C)\",\"temp_f\":46.6,\"temp_c\":8.1,\"relative_humidity\":\"88%\",\"wind_string\":\"From the West at 5.7 MPH Gusting to 11.4 MPH\",\"wind_dir\":\"West\",\"wind_degrees\":265,\"wind_mph\":5.7,\"wind_gust_mph\":\"11.4\",\"wind_kph\":9.2,\"wind_gust_kph\":\"18.3\",\"pressure_mb\":\"1003\",\"pressure_in\":\"29.62\",\"pressure_trend\":\"0\",\"dewpoint_string\":\"43 F (6 C)\",\"dewpoint_f\":43,\"dewpoint_c\":6,\"heat_index_string\":\"NA\",\"heat_index_f\":\"NA\",\"heat_index_c\":\"NA\",\"windchill_string\":\"44 F (7 C)\",\"windchill_f\":\"44\",\"windchill_c\":\"7\",\"feelslike_string\":\"44 F (7 C)\",\"feelslike_f\":\"44\",\"feelslike_c\":\"7\",\"visibility_mi\":\"5.6\",\"visibility_km\":\"9.0\",\"solarradiation\":\"--\",\"UV\":\"0\",\"precip_1hr_string\":\"0.07 in ( 2 mm)\",\"precip_1hr_in\":\"0.07\",\"precip_1hr_metric\":\" 2\",\"precip_today_string\":\"0.35 in (9 mm)\",\"precip_today_in\":\"0.35\",\"precip_today_metric\":\"9\",\"icon\":\"rain\",\"icon_url\":\"http://icons.wxug.com/i/c/k/rain.gif\",\"forecast_url\":\"http://www.wunderground.com/global/stations/11782.html\",\"history_url\":\"http://www.wunderground.com/weatherstation/WXDailyHistory.asp?ID=INOVYJIC2\",\"ob_url\":\"http://www.wunderground.com/cgi-bin/findweather/getForecast?query=49.610466,18.165237\",\"nowcast\":\"\"}}";

	private Weather getWeather(Location location) {
		WundergroundAPI page = null;
		Weather w = null;

		try {
			RestTemplate restTemplate = new RestTemplate();
			String url_full = String.format(url, location.getState(),
					location.getCity());
			page = restTemplate.getForObject(url_full, WundergroundAPI.class);

//			 if (json != null) {
//			 ObjectMapper mapper = new ObjectMapper();
//			 try {
//			 page = mapper.readValue(json, WundergroundAPI.class);
//			
//			 } catch (JsonParseException e) {
//			 e.printStackTrace();
//			 } catch (JsonMappingException e) {
//			 e.printStackTrace();
//			 } catch (IOException e) {
//			 e.printStackTrace();
//			 }
//			 }

			stateDao.weatherServerRequested(location);
			w = weaterDao.findByLocation(location.getLocation());
			if (page != null && page.getCurrent_observation() != null) {
				if (w == null) {
					w = new Weather();
				}
				// HashMap<String, String> map = new HashMap<String, String>();
				// map.put("location",
				// "curent_observation.display_location.city");
				//
				// copyBeanProperties(page, w, map);

				// w.setLocation(page.getCurrent_observation().getDisplay_location().getCity());
				// w.setTimestamp(page.getCurrent_observation().getObservation_time_rfc822());
				w.setLocation(location.getLocation());
				w.setTimestamp(new Timestamp(new Date().getTime()));
				w.setTemp_celsius(page.getCurrent_observation().getTemp_c());
				w.setWind_speed_m_per_s(page.getCurrent_observation()
						.getWind_kph() / 3.6);
				w.setRelative_humidity(page.getCurrent_observation()
						.getRelative_humidity());
				w.setWind_speed_m_per_s(page.getCurrent_observation()
						.getWind_mps());
				w.setWind_direction(page.getCurrent_observation().getWind_dir());
				w.setWind_description(page.getCurrent_observation()
						.getWindchill_string());
				w.setWeather_description(page.getCurrent_observation()
						.getWeather());

			}
		} finally {

		}

		return w;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see services.ComunicatorInterface#getAllCocations()
	 */
	@Override
	public void getAllLocations() {
		if (!inGettingWeather) {
			inGettingWeather = true;
			try {
				if (stateDao != null) {
					for (Location location : locationDao
							.getAllLocationsOrderedbyLastUpdate()) {
						if (stateDao
								.isRequestToWeatherInTimeForLocation(location)) {
							System.out.println("==== in getting weather for "
									+ location.getCity() + " ====");
							weaterDao
									.setWeather(location, getWeather(location));
						}
					}
				} else
					System.out
							.println("!!!! Error configured Autowired for state DAO !!!!");
			} finally {
				inGettingWeather = false;
			}
		}
	}

}
