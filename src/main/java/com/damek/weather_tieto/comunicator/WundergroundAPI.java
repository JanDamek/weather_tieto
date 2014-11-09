/**
 * 
 */
package com.damek.weather_tieto.comunicator;

/**
 * @author jandamek
 *
 */

import org.codehaus.jackson.annotate.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WundergroundAPI {

	@JsonIgnoreProperties(ignoreUnknown = true)
	public class Response {

		@JsonIgnoreProperties(ignoreUnknown = true)
		public class Features {
			private String conditions;

			/**
			 * @return the conditions
			 */
			public String getConditions() {
				return conditions;
			}

			/**
			 * @param conditions
			 *            the conditions to set
			 */
			public void setConditions(String conditions) {
				this.conditions = conditions;
			}
		}

		private String version;
		private String termsofService;
		private Features features;

		/**
		 * @return the version
		 */
		public String getVersion() {
			return version;
		}

		/**
		 * @param version
		 *            the version to set
		 */
		public void setVersion(String version) {
			this.version = version;
		}

		/**
		 * @return the termsofService
		 */
		public String getTermsofService() {
			return termsofService;
		}

		/**
		 * @param termsofService
		 *            the termsofService to set
		 */
		public void setTermsofService(String termsofService) {
			this.termsofService = termsofService;
		}

		/**
		 * @return the features
		 */
		public Features getFeatures() {
			return features;
		}

		/**
		 * @param features
		 *            the features to set
		 */
		public void setFeatures(Features features) {
			this.features = features;
		}
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public class Current_observation {
		
		@JsonIgnoreProperties(ignoreUnknown = true)
		public class Image {
			private String url;
			private String title;
			private String link;

			/**
			 * @return the url
			 */
			public String getUrl() {
				return url;
			}

			/**
			 * @param url
			 *            the url to set
			 */
			public void setUrl(String url) {
				this.url = url;
			}

			/**
			 * @return the title
			 */
			public String getTitle() {
				return title;
			}

			/**
			 * @param title
			 *            the title to set
			 */
			public void setTitle(String title) {
				this.title = title;
			}

			/**
			 * @return the link
			 */
			public String getLink() {
				return link;
			}

			/**
			 * @param link
			 *            the link to set
			 */
			public void setLink(String link) {
				this.link = link;
			}

		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public class Display_location {
			private String full;
			private String city;
			private String state;
			private String state_name;
			private String country;
			private String country_iso3166;
			private String zip;
			private String magic;
			private String wmo;
			private String latitude;
			private String longitude;
			private String elevation;

			/**
			 * @return the full
			 */
			public String getFull() {
				return full;
			}

			/**
			 * @param full
			 *            the full to set
			 */
			public void setFull(String full) {
				this.full = full;
			}

			/**
			 * @return the city
			 */
			public String getCity() {
				return city;
			}

			/**
			 * @param city
			 *            the city to set
			 */
			public void setCity(String city) {
				this.city = city;
			}

			/**
			 * @return the state
			 */
			public String getState() {
				return state;
			}

			/**
			 * @param state
			 *            the state to set
			 */
			public void setState(String state) {
				this.state = state;
			}

			/**
			 * @return the state_name
			 */
			public String getState_name() {
				return state_name;
			}

			/**
			 * @param state_name
			 *            the state_name to set
			 */
			public void setState_name(String state_name) {
				this.state_name = state_name;
			}

			/**
			 * @return the country
			 */
			public String getCountry() {
				return country;
			}

			/**
			 * @param country
			 *            the country to set
			 */
			public void setCountry(String country) {
				this.country = country;
			}

			/**
			 * @return the country_iso3166
			 */
			public String getCountry_iso3166() {
				return country_iso3166;
			}

			/**
			 * @param country_iso3166
			 *            the country_iso3166 to set
			 */
			public void setCountry_iso3166(String country_iso3166) {
				this.country_iso3166 = country_iso3166;
			}

			/**
			 * @return the zip
			 */
			public String getZip() {
				return zip;
			}

			/**
			 * @param zip
			 *            the zip to set
			 */
			public void setZip(String zip) {
				this.zip = zip;
			}

			/**
			 * @return the magic
			 */
			public String getMagic() {
				return magic;
			}

			/**
			 * @param magic
			 *            the magic to set
			 */
			public void setMagic(String magic) {
				this.magic = magic;
			}

			/**
			 * @return the wmo
			 */
			public String getWmo() {
				return wmo;
			}

			/**
			 * @param wmo
			 *            the wmo to set
			 */
			public void setWmo(String wmo) {
				this.wmo = wmo;
			}

			/**
			 * @return the latitude
			 */
			public String getLatitude() {
				return latitude;
			}

			/**
			 * @param latitude
			 *            the latitude to set
			 */
			public void setLatitude(String latitude) {
				this.latitude = latitude;
			}

			/**
			 * @return the longitude
			 */
			public String getLongitude() {
				return longitude;
			}

			/**
			 * @param longitude
			 *            the longitude to set
			 */
			public void setLongitude(String longitude) {
				this.longitude = longitude;
			}

			/**
			 * @return the elevation
			 */
			public String getElevation() {
				return elevation;
			}

			/**
			 * @param elevation
			 *            the elevation to set
			 */
			public void setElevation(String elevation) {
				this.elevation = elevation;
			}
		}
		
		@JsonIgnoreProperties(ignoreUnknown = true)
		public class Estimated {
			
		}

		@JsonIgnoreProperties(ignoreUnknown = true)
		public class Observation_location {
			private String full;
			private String city;
			private String state;
			private String country;
			private String country_iso3166;
			private String latitude;
			private String longitude;
			private String elevation;

			/**
			 * @return the full
			 */
			public String getFull() {
				return full;
			}

			/**
			 * @param full
			 *            the full to set
			 */
			public void setFull(String full) {
				this.full = full;
			}

			/**
			 * @return the city
			 */
			public String getCity() {
				return city;
			}

			/**
			 * @param city
			 *            the city to set
			 */
			public void setCity(String city) {
				this.city = city;
			}

			/**
			 * @return the state
			 */
			public String getState() {
				return state;
			}

			/**
			 * @param state
			 *            the state to set
			 */
			public void setState(String state) {
				this.state = state;
			}

			/**
			 * @return the country
			 */
			public String getCountry() {
				return country;
			}

			/**
			 * @param country
			 *            the country to set
			 */
			public void setCountry(String country) {
				this.country = country;
			}

			/**
			 * @return the country_iso3166
			 */
			public String getCountry_iso3166() {
				return country_iso3166;
			}

			/**
			 * @param country_iso3166
			 *            the country_iso3166 to set
			 */
			public void setCountry_iso3166(String country_iso3166) {
				this.country_iso3166 = country_iso3166;
			}

			/**
			 * @return the latitude
			 */
			public String getLatitude() {
				return latitude;
			}

			/**
			 * @param latitude
			 *            the latitude to set
			 */
			public void setLatitude(String latitude) {
				this.latitude = latitude;
			}

			/**
			 * @return the longitude
			 */
			public String getLongitude() {
				return longitude;
			}

			/**
			 * @param longitude
			 *            the longitude to set
			 */
			public void setLongitude(String longitude) {
				this.longitude = longitude;
			}

			/**
			 * @return the elevation
			 */
			public String getElevation() {
				return elevation;
			}

			/**
			 * @param elevation
			 *            the elevation to set
			 */
			public void setElevation(String elevation) {
				this.elevation = elevation;
			}
		}

		private Image image;
		private Display_location display_location;
		private Observation_location observation_location;
		private Estimated estimated;
		private String station_id;
		private String observation_time;
		private String observation_time_rfc822;
		private String observation_epoch;
		private String local_time_rfc822;
		private String local_epoch;
		private String local_tz_short;
		private String local_tz_long;
		private String local_tz_offset;
		private String weather;
		private String temperature_string;
		private String temp_f;
		private String temp_c;
		private String relative_humidity;
		private String wind_string;
		private String wind_dir;
		private int wind_degrees;
		private double wind_mph;
		private String wind_gust_mph;
		private double wind_kph;
		private String wind_gust_kph;
		private String pressure_mb;
		private String pressure_in;
		private String pressure_trend;
		private String dewpoint_string;
		private int dewpoint_f;
		private int dewpoint_c;
		private String heat_index_string;
		private String heat_index_f;
		private String heat_index_c;
		private String windchill_string;
		private String windchill_f;
		private String windchill_c;
		private String feelslike_string;
		private String feelslike_f;
		private String feelslike_c;
		private String visibility_mi;
		private String visibility_km;
		private String solarradiation;
		private String UV;
		private String precip_1hr_string;
		private String precip_1hr_in;
		private String precip_1hr_metric;
		private String precip_today_string;
		private String precip_today_in;
		private String precip_today_metric;
		private String icon;
		private String icon_url;
		private String forecast_url;
		private String history_url;
		private String ob_url;
		private String nowcast;

		/**
		 * @return the image
		 */
		public Image getImage() {
			return image;
		}

		/**
		 * @param image
		 *            the image to set
		 */
		public void setImage(Image image) {
			this.image = image;
		}

		/**
		 * @return the display_location
		 */
		public Display_location getDisplay_location() {
			return display_location;
		}

		/**
		 * @param display_location
		 *            the display_location to set
		 */
		public void setDisplay_location(Display_location display_location) {
			this.display_location = display_location;
		}

		/**
		 * @return the observation_location
		 */
		public Observation_location getObservation_location() {
			return observation_location;
		}

		/**
		 * @param observation_location
		 *            the observation_location to set
		 */
		public void setObservation_location(
				Observation_location observation_location) {
			this.observation_location = observation_location;
		}

		/**
		 * @return the station_id
		 */
		public String getStation_id() {
			return station_id;
		}

		/**
		 * @param station_id
		 *            the station_id to set
		 */
		public void setStation_id(String station_id) {
			this.station_id = station_id;
		}

		/**
		 * @return the observation_time
		 */
		public String getObservation_time() {
			return observation_time;
		}

		/**
		 * @param observation_time
		 *            the observation_time to set
		 */
		public void setObservation_time(String observation_time) {
			this.observation_time = observation_time;
		}

		/**
		 * @return the observation_time_rfc822
		 */
		public String getObservation_time_rfc822() {
			return observation_time_rfc822;
		}

		/**
		 * @param observation_time_rfc822
		 *            the observation_time_rfc822 to set
		 */
		public void setObservation_time_rfc822(String observation_time_rfc822) {
			this.observation_time_rfc822 = observation_time_rfc822;
		}

		/**
		 * @return the observation_epoch
		 */
		public String getObservation_epoch() {
			return observation_epoch;
		}

		/**
		 * @param observation_epoch
		 *            the observation_epoch to set
		 */
		public void setObservation_epoch(String observation_epoch) {
			this.observation_epoch = observation_epoch;
		}

		/**
		 * @return the local_time_rfc822
		 */
		public String getLocal_time_rfc822() {
			return local_time_rfc822;
		}

		/**
		 * @param local_time_rfc822
		 *            the local_time_rfc822 to set
		 */
		public void setLocal_time_rfc822(String local_time_rfc822) {
			this.local_time_rfc822 = local_time_rfc822;
		}

		/**
		 * @return the local_epoch
		 */
		public String getLocal_epoch() {
			return local_epoch;
		}

		/**
		 * @param local_epoch
		 *            the local_epoch to set
		 */
		public void setLocal_epoch(String local_epoch) {
			this.local_epoch = local_epoch;
		}

		/**
		 * @return the local_tz_short
		 */
		public String getLocal_tz_short() {
			return local_tz_short;
		}

		/**
		 * @param local_tz_short
		 *            the local_tz_short to set
		 */
		public void setLocal_tz_short(String local_tz_short) {
			this.local_tz_short = local_tz_short;
		}

		/**
		 * @return the local_tz_long
		 */
		public String getLocal_tz_long() {
			return local_tz_long;
		}

		/**
		 * @param local_tz_long
		 *            the local_tz_long to set
		 */
		public void setLocal_tz_long(String local_tz_long) {
			this.local_tz_long = local_tz_long;
		}

		/**
		 * @return the local_tz_offset
		 */
		public String getLocal_tz_offset() {
			return local_tz_offset;
		}

		/**
		 * @param local_tz_offset
		 *            the local_tz_offset to set
		 */
		public void setLocal_tz_offset(String local_tz_offset) {
			this.local_tz_offset = local_tz_offset;
		}

		/**
		 * @return the weather
		 */
		public String getWeather() {
			return weather;
		}

		/**
		 * @param weather
		 *            the weather to set
		 */
		public void setWeather(String weather) {
			this.weather = weather;
		}

		/**
		 * @return the temperature_string
		 */
		public String getTemperature_string() {
			return temperature_string;
		}

		/**
		 * @param temperature_string
		 *            the temperature_string to set
		 */
		public void setTemperature_string(String temperature_string) {
			this.temperature_string = temperature_string;
		}

		/**
		 * @return the temp_f
		 */
		public String getTemp_f() {
			return temp_f;
		}

		/**
		 * @param temp_f
		 *            the temp_f to set
		 */
		public void setTemp_f(String temp_f) {
			this.temp_f = temp_f;
		}

		/**
		 * @return the temp_c
		 */
		public Double getTemp_c() {
			return Double.parseDouble(temp_c);
		}

		/**
		 * @param temp_c
		 *            the temp_c to set
		 */
		public void setTemp_c(String temp_c) {
			this.temp_c = temp_c;
		}

		/**
		 * @return the relative_humidity
		 */
		public int getRelative_humidity() {
			return Integer.parseInt(relative_humidity.trim().replaceAll("%", ""));
		}

		/**
		 * @param relative_humidity
		 *            the relative_humidity to set
		 */
		public void setRelative_humidity(String relative_humidity) {
			this.relative_humidity = relative_humidity;
		}

		/**
		 * @return the wind_string
		 */
		public String getWind_string() {
			return wind_string;
		}

		/**
		 * @param wind_string
		 *            the wind_string to set
		 */
		public void setWind_string(String wind_string) {
			this.wind_string = wind_string;
		}

		/**
		 * @return the wind_dir
		 */
		public String getWind_dir() {
			return wind_dir;
		}

		/**
		 * @param wind_dir
		 *            the wind_dir to set
		 */
		public void setWind_dir(String wind_dir) {
			this.wind_dir = wind_dir;
		}

		/**
		 * @return the wind_degrees
		 */
		public int getWind_degrees() {
			return wind_degrees;
		}

		/**
		 * @param wind_degrees
		 *            the wind_degrees to set
		 */
		public void setWind_degrees(int wind_degrees) {
			this.wind_degrees = wind_degrees;
		}

		/**
		 * @return the wind_mph
		 */
		public double getWind_mph() {
			return wind_mph;
		}

		/**
		 * @param wind_mph
		 *            the wind_mph to set
		 */
		public void setWind_mph(double wind_mph) {
			this.wind_mph = wind_mph;
		}

		/**
		 * @return the wind_gust_mph
		 */
		public String getWind_gust_mph() {
			return wind_gust_mph;
		}

		/**
		 * @param wind_gust_mph
		 *            the wind_gust_mph to set
		 */
		public void setWind_gust_mph(String wind_gust_mph) {
			this.wind_gust_mph = wind_gust_mph;
		}

		/**
		 * @return the wind_kph
		 */
		public double getWind_kph() {
			return wind_kph;
		}

		/**
		 * @param wind_kph
		 *            the wind_kph to set
		 */
		public void setWind_kph(double wind_kph) {
			this.wind_kph = wind_kph;
		}

		/**
		 * @return the wind_gust_kph
		 */
		public String getWind_gust_kph() {
			return wind_gust_kph;
		}

		/**
		 * @param wind_gust_kph
		 *            the wind_gust_kph to set
		 */
		public void setWind_gust_kph(String wind_gust_kph) {
			this.wind_gust_kph = wind_gust_kph;
		}

		/**
		 * @return the pressure_mb
		 */
		public String getPressure_mb() {
			return pressure_mb;
		}

		/**
		 * @param pressure_mb
		 *            the pressure_mb to set
		 */
		public void setPressure_mb(String pressure_mb) {
			this.pressure_mb = pressure_mb;
		}

		/**
		 * @return the pressure_in
		 */
		public String getPressure_in() {
			return pressure_in;
		}

		/**
		 * @param pressure_in
		 *            the pressure_in to set
		 */
		public void setPressure_in(String pressure_in) {
			this.pressure_in = pressure_in;
		}

		/**
		 * @return the pressure_trend
		 */
		public String getPressure_trend() {
			return pressure_trend;
		}

		/**
		 * @param pressure_trend
		 *            the pressure_trend to set
		 */
		public void setPressure_trend(String pressure_trend) {
			this.pressure_trend = pressure_trend;
		}

		/**
		 * @return the dewpoint_string
		 */
		public String getDewpoint_string() {
			return dewpoint_string;
		}

		/**
		 * @param dewpoint_string
		 *            the dewpoint_string to set
		 */
		public void setDewpoint_string(String dewpoint_string) {
			this.dewpoint_string = dewpoint_string;
		}

		/**
		 * @return the dewpoint_f
		 */
		public int getDewpoint_f() {
			return dewpoint_f;
		}

		/**
		 * @param dewpoint_f
		 *            the dewpoint_f to set
		 */
		public void setDewpoint_f(int dewpoint_f) {
			this.dewpoint_f = dewpoint_f;
		}

		/**
		 * @return the dewpoint_c
		 */
		public int getDewpoint_c() {
			return dewpoint_c;
		}

		/**
		 * @param dewpoint_c
		 *            the dewpoint_c to set
		 */
		public void setDewpoint_c(int dewpoint_c) {
			this.dewpoint_c = dewpoint_c;
		}

		/**
		 * @return the heat_index_string
		 */
		public String getHeat_index_string() {
			return heat_index_string;
		}

		/**
		 * @param heat_index_string
		 *            the heat_index_string to set
		 */
		public void setHeat_index_string(String heat_index_string) {
			this.heat_index_string = heat_index_string;
		}

		/**
		 * @return the heat_index_f
		 */
		public String getHeat_index_f() {
			return heat_index_f;
		}

		/**
		 * @param heat_index_f
		 *            the heat_index_f to set
		 */
		public void setHeat_index_f(String heat_index_f) {
			this.heat_index_f = heat_index_f;
		}

		/**
		 * @return the heat_index_c
		 */
		public String getHeat_index_c() {
			return heat_index_c;
		}

		/**
		 * @param heat_index_c
		 *            the heat_index_c to set
		 */
		public void setHeat_index_c(String heat_index_c) {
			this.heat_index_c = heat_index_c;
		}

		/**
		 * @return the windchill_string
		 */
		public String getWindchill_string() {
			return windchill_string;
		}

		/**
		 * @param windchill_string
		 *            the windchill_string to set
		 */
		public void setWindchill_string(String windchill_string) {
			this.windchill_string = windchill_string;
		}

		/**
		 * @return the windchill_f
		 */
		public String getWindchill_f() {
			return windchill_f;
		}

		/**
		 * @param windchill_f
		 *            the windchill_f to set
		 */
		public void setWindchill_f(String windchill_f) {
			this.windchill_f = windchill_f;
		}

		/**
		 * @return the windchill_c
		 */
		public String getWindchill_c() {
			return windchill_c;
		}

		/**
		 * @param windchill_c
		 *            the windchill_c to set
		 */
		public void setWindchill_c(String windchill_c) {
			this.windchill_c = windchill_c;
		}

		/**
		 * @return the feelslike_string
		 */
		public String getFeelslike_string() {
			return feelslike_string;
		}

		/**
		 * @param feelslike_string
		 *            the feelslike_string to set
		 */
		public void setFeelslike_string(String feelslike_string) {
			this.feelslike_string = feelslike_string;
		}

		/**
		 * @return the feelslike_f
		 */
		public String getFeelslike_f() {
			return feelslike_f;
		}

		/**
		 * @param feelslike_f
		 *            the feelslike_f to set
		 */
		public void setFeelslike_f(String feelslike_f) {
			this.feelslike_f = feelslike_f;
		}

		/**
		 * @return the feelslike_c
		 */
		public String getFeelslike_c() {
			return feelslike_c;
		}

		/**
		 * @param feelslike_c
		 *            the feelslike_c to set
		 */
		public void setFeelslike_c(String feelslike_c) {
			this.feelslike_c = feelslike_c;
		}

		/**
		 * @return the visibility_mi
		 */
		public String getVisibility_mi() {
			return visibility_mi;
		}

		/**
		 * @param visibility_mi
		 *            the visibility_mi to set
		 */
		public void setVisibility_mi(String visibility_mi) {
			this.visibility_mi = visibility_mi;
		}

		/**
		 * @return the visibility_km
		 */
		public String getVisibility_km() {
			return visibility_km;
		}

		/**
		 * @param visibility_km
		 *            the visibility_km to set
		 */
		public void setVisibility_km(String visibility_km) {
			this.visibility_km = visibility_km;
		}

		/**
		 * @return the solarradiation
		 */
		public String getSolarradiation() {
			return solarradiation;
		}

		/**
		 * @param solarradiation
		 *            the solarradiation to set
		 */
		public void setSolarradiation(String solarradiation) {
			this.solarradiation = solarradiation;
		}

		/**
		 * @return the uV
		 */
		public String getUV() {
			return UV;
		}

		/**
		 * @param uV
		 *            the uV to set
		 */
		public void setUV(String uV) {
			UV = uV;
		}

		/**
		 * @return the precip_1hr_string
		 */
		public String getPrecip_1hr_string() {
			return precip_1hr_string;
		}

		/**
		 * @param precip_1hr_string
		 *            the precip_1hr_string to set
		 */
		public void setPrecip_1hr_string(String precip_1hr_string) {
			this.precip_1hr_string = precip_1hr_string;
		}

		/**
		 * @return the precip_1hr_in
		 */
		public String getPrecip_1hr_in() {
			return precip_1hr_in;
		}

		/**
		 * @param precip_1hr_in
		 *            the precip_1hr_in to set
		 */
		public void setPrecip_1hr_in(String precip_1hr_in) {
			this.precip_1hr_in = precip_1hr_in;
		}

		/**
		 * @return the precip_1hr_metric
		 */
		public String getPrecip_1hr_metric() {
			return precip_1hr_metric;
		}

		/**
		 * @param precip_1hr_metric
		 *            the precip_1hr_metric to set
		 */
		public void setPrecip_1hr_metric(String precip_1hr_metric) {
			this.precip_1hr_metric = precip_1hr_metric;
		}

		/**
		 * @return the precip_today_string
		 */
		public String getPrecip_today_string() {
			return precip_today_string;
		}

		/**
		 * @param precip_today_string
		 *            the precip_today_string to set
		 */
		public void setPrecip_today_string(String precip_today_string) {
			this.precip_today_string = precip_today_string;
		}

		/**
		 * @return the precip_today_in
		 */
		public String getPrecip_today_in() {
			return precip_today_in;
		}

		/**
		 * @param precip_today_in
		 *            the precip_today_in to set
		 */
		public void setPrecip_today_in(String precip_today_in) {
			this.precip_today_in = precip_today_in;
		}

		/**
		 * @return the precip_today_metric
		 */
		public String getPrecip_today_metric() {
			return precip_today_metric;
		}

		/**
		 * @param precip_today_metric
		 *            the precip_today_metric to set
		 */
		public void setPrecip_today_metric(String precip_today_metric) {
			this.precip_today_metric = precip_today_metric;
		}

		/**
		 * @return the icon
		 */
		public String getIcon() {
			return icon;
		}

		/**
		 * @param icon
		 *            the icon to set
		 */
		public void setIcon(String icon) {
			this.icon = icon;
		}

		/**
		 * @return the icon_url
		 */
		public String getIcon_url() {
			return icon_url;
		}

		/**
		 * @param icon_url
		 *            the icon_url to set
		 */
		public void setIcon_url(String icon_url) {
			this.icon_url = icon_url;
		}

		/**
		 * @return the forecast_url
		 */
		public String getForecast_url() {
			return forecast_url;
		}

		/**
		 * @param forecast_url
		 *            the forecast_url to set
		 */
		public void setForecast_url(String forecast_url) {
			this.forecast_url = forecast_url;
		}

		/**
		 * @return the history_url
		 */
		public String getHistory_url() {
			return history_url;
		}

		/**
		 * @param history_url
		 *            the history_url to set
		 */
		public void setHistory_url(String history_url) {
			this.history_url = history_url;
		}

		/**
		 * @return the ob_url
		 */
		public String getOb_url() {
			return ob_url;
		}

		/**
		 * @param ob_url
		 *            the ob_url to set
		 */
		public void setOb_url(String ob_url) {
			this.ob_url = ob_url;
		}

		/**
		 * @return the nowcast
		 */
		public String getNowcast() {
			return nowcast;
		}

		/**
		 * @param nowcast
		 *            the nowcast to set
		 */
		public void setNowcast(String nowcast) {
			this.nowcast = nowcast;
		}

		public Double getWind_mps() {
			return this.wind_kph/3.6;
		}

		/**
		 * @return the estimated
		 */
		public Estimated getEstimated() {
			return estimated;
		}

		/**
		 * @param estimated the estimated to set
		 */
		public void setEstimated(Estimated estimated) {
			this.estimated = estimated;
		}
	}

	private Response response;
	private Current_observation current_observation;

	/**
	 * @return the current_observation
	 */
	public Current_observation getCurrent_observation() {
		return current_observation;
	}

	/**
	 * @param current_observation
	 *            the current_observation to set
	 */
	public void setCurrent_observation(Current_observation current_observation) {
		this.current_observation = current_observation;
	}

	/**
	 * @return the response
	 */
	public Response getResponse() {
		return response;
	}

	/**
	 * @param response
	 *            the response to set
	 */
	public void setResponse(Response response) {
		this.response = response;
	}
}
