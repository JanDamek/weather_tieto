//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.10 at 08:06:59 AM CET 
//


package com.damek.weather_tieto.soap;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.damek.weather_tieto.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.damek.weather_tieto.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetWeatherAllResponse }
     * 
     */
    public GetWeatherAllResponse createGetWeatherAllResponse() {
        return new GetWeatherAllResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWeather }
     * 
     */
    public ArrayOfWeather createArrayOfWeather() {
        return new ArrayOfWeather();
    }

    /**
     * Create an instance of {@link GetWeatherRequest }
     * 
     */
    public GetWeatherRequest createGetWeatherRequest() {
        return new GetWeatherRequest();
    }

    /**
     * Create an instance of {@link GetWeatherResponse }
     * 
     */
    public GetWeatherResponse createGetWeatherResponse() {
        return new GetWeatherResponse();
    }

    /**
     * Create an instance of {@link Weather }
     * 
     */
    public Weather createWeather() {
        return new Weather();
    }

}
