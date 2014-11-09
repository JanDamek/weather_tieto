package com.damek.weather_tieto.domain;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-11-07T22:57:58.536+0100")
@StaticMetamodel(State.class)
public class State_ {
	public static volatile SingularAttribute<State, Long> id;
	public static volatile SingularAttribute<State, Integer> maxCountInMinute;
	public static volatile SingularAttribute<State, Integer> maxCountInDay;
	public static volatile SingularAttribute<State, Integer> countInLastDayOfYear;
	public static volatile SingularAttribute<State, Integer> countInLastMinute;
	public static volatile SingularAttribute<State, Integer> lastMinute;
	public static volatile SingularAttribute<State, Integer> lastDayOfYear;
	public static volatile SingularAttribute<State, Integer> maxOldWeatherInMinutes;
	public static volatile SingularAttribute<State, Timestamp> lastRequest;
}
