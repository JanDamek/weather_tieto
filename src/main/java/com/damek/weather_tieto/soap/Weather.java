//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.10 at 08:06:59 AM CET 
//


package com.damek.weather_tieto.soap;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for weather complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="weather">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="temp_celsius" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="relative_humidity" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="wind_speed_m_per_s" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="wind_direction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wind_description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="weather_description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "weather", propOrder = {
    "location",
    "timestamp",
    "tempCelsius",
    "relativeHumidity",
    "windSpeedMPerS",
    "windDirection",
    "windDescription",
    "weatherDescription"
})
public class Weather {

    @XmlElement(required = true)
    protected String location;
    @XmlElement(required = true)
    protected String timestamp;
    @XmlElement(name = "temp_celsius")
    protected double tempCelsius;
    @XmlElement(name = "relative_humidity", required = true)
    protected BigInteger relativeHumidity;
    @XmlElement(name = "wind_speed_m_per_s")
    protected double windSpeedMPerS;
    @XmlElement(name = "wind_direction", required = true)
    protected String windDirection;
    @XmlElement(name = "wind_description", required = true)
    protected String windDescription;
    @XmlElement(name = "weather_description", required = true)
    protected String weatherDescription;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestamp(String value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the tempCelsius property.
     * 
     */
    public double getTempCelsius() {
        return tempCelsius;
    }

    /**
     * Sets the value of the tempCelsius property.
     * 
     */
    public void setTempCelsius(double value) {
        this.tempCelsius = value;
    }

    /**
     * Gets the value of the relativeHumidity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRelativeHumidity() {
        return relativeHumidity;
    }

    /**
     * Sets the value of the relativeHumidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRelativeHumidity(BigInteger value) {
        this.relativeHumidity = value;
    }

    /**
     * Gets the value of the windSpeedMPerS property.
     * 
     */
    public double getWindSpeedMPerS() {
        return windSpeedMPerS;
    }

    /**
     * Sets the value of the windSpeedMPerS property.
     * 
     */
    public void setWindSpeedMPerS(double value) {
        this.windSpeedMPerS = value;
    }

    /**
     * Gets the value of the windDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindDirection() {
        return windDirection;
    }

    /**
     * Sets the value of the windDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindDirection(String value) {
        this.windDirection = value;
    }

    /**
     * Gets the value of the windDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindDescription() {
        return windDescription;
    }

    /**
     * Sets the value of the windDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindDescription(String value) {
        this.windDescription = value;
    }

    /**
     * Gets the value of the weatherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeatherDescription() {
        return weatherDescription;
    }

    /**
     * Sets the value of the weatherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeatherDescription(String value) {
        this.weatherDescription = value;
    }

}
