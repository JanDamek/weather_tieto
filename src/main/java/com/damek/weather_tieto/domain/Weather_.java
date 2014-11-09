package com.damek.weather_tieto.domain;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-11-06T23:57:13.212+0100")
@StaticMetamodel(Weather.class)
public class Weather_ {
	public static volatile SingularAttribute<Weather, String> location;
	public static volatile SingularAttribute<Weather, Timestamp> timestamp;
	public static volatile SingularAttribute<Weather, Double> temp_celsius;
	public static volatile SingularAttribute<Weather, Integer> relative_humidity;
	public static volatile SingularAttribute<Weather, Double> wind_speed_m_per_s;
	public static volatile SingularAttribute<Weather, String> wind_direction;
	public static volatile SingularAttribute<Weather, String> wind_description;
	public static volatile SingularAttribute<Weather, String> weather_description;
}
