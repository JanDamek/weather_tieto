/**
 * 
 */
package com.damek.weather_tieto.domain;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

/**
 * @author jandamek
 *
 */
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "location"))
public class Weather {

	@Id
	@NotNull
	private String location;
	
	@NotNull
	private Timestamp timestamp;
	
	@NotNull
	private Double temp_celsius;
	
	@NotNull
	private int relative_humidity;
	
	@NotNull
	private Double wind_speed_m_per_s;
	
	@NotNull
	private String wind_direction;
	
	@NotNull
	private String wind_description;
	
	@NotNull
	private String weather_description;

	public Weather() {

	}

	// public Weather(WundergroundAPI wunder) {
	// if (wunder != null) {
	// this.location = wunder.getCurrent_observation()
	// .getDisplay_location().getCity();
	// this.timestamp = wunder.getCurrent_observation()
	// .getObservation_time_rfc822();
	// this.temp_celsius = wunder.getCurrent_observation().getTemp_c();
	// this.relative_humidity = wunder.getCurrent_observation()
	// .getRelative_humidity();
	// this.wind_speed_m_per_s = wunder.getCurrent_observation()
	// .getWind_mps();
	// this.wind_direction = wunder.getCurrent_observation().getWind_dir();
	// this.wind_description = wunder.getCurrent_observation()
	// .getWindchill_string();
	// this.weather_description = wunder.getCurrent_observation()
	// .getWeather();
	// }
	// }

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the timestamp
	 */
	public Timestamp getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp
	 *            the timestamp to set
	 */
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * @return the temp_celsius
	 */
	public Double getTemp_celsius() {
		return temp_celsius;
	}

	/**
	 * @param temp_celsius
	 *            the temp_celsius to set
	 */
	public void setTemp_celsius(Double temp_celsius) {
		this.temp_celsius = temp_celsius;
	}

	/**
	 * @return the relative_humidity
	 */
	public int getRelative_humidity() {
		return relative_humidity;
	}

	/**
	 * @param relative_humidity
	 *            the relative_humidity to set
	 */
	public void setRelative_humidity(int relative_humidity) {
		this.relative_humidity = relative_humidity;
	}

	/**
	 * @return the wind_speed_m_per_s
	 */
	public Double getWind_speed_m_per_s() {
		return wind_speed_m_per_s;
	}

	/**
	 * @param wind_speed_m_per_s
	 *            the wind_speed_m_per_s to set
	 */
	public void setWind_speed_m_per_s(Double wind_speed_m_per_s) {
		this.wind_speed_m_per_s = wind_speed_m_per_s;
	}

	/**
	 * @return the wind_direction
	 */
	public String getWind_direction() {
		return wind_direction;
	}

	/**
	 * @param wind_direction
	 *            the wind_direction to set
	 */
	public void setWind_direction(String wind_direction) {
		this.wind_direction = wind_direction;
	}

	/**
	 * @return the wind_description
	 */
	public String getWind_description() {
		return wind_description;
	}

	/**
	 * @param wind_description
	 *            the wind_description to set
	 */
	public void setWind_description(String wind_description) {
		this.wind_description = wind_description;
	}

	/**
	 * @return the weather_description
	 */
	public String getWeather_description() {
		return weather_description;
	}

	/**
	 * @param weather_description
	 *            the weather_description to set
	 */
	public void setWeather_description(String weather_description) {
		this.weather_description = weather_description;
	}

}
