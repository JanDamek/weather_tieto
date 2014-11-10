
package com.damek.weather_tieto.mvc.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getWeatherResponse", namespace = "http://mvc.weather_tieto.damek.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getWeatherResponse", namespace = "http://mvc.weather_tieto.damek.com/")
public class GetWeatherResponse {

    @XmlElement(name = "return", namespace = "")
    private com.damek.weather_tieto.domain.Weather _return;

    /**
     * 
     * @return
     *     returns Weather
     */
    public com.damek.weather_tieto.domain.Weather getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.damek.weather_tieto.domain.Weather _return) {
        this._return = _return;
    }

}
