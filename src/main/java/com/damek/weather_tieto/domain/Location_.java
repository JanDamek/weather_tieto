package com.damek.weather_tieto.domain;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-11-07T17:15:15.409+0100")
@StaticMetamodel(Location.class)
public class Location_ {
	public static volatile SingularAttribute<Location, String> location;
	public static volatile SingularAttribute<Location, String> state;
	public static volatile SingularAttribute<Location, String> city;
	public static volatile SingularAttribute<Location, Boolean> enabled;
	public static volatile SingularAttribute<Location, Timestamp> last_update;
}
