package com.damek.weather_tieto.mvc;

import java.io.IOException;

import javax.annotation.Resource;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Endpoint
public class WeatherEndpoint {
	private static final String NAMESPACE_URI = "http://localhost:8080/";

	@Resource(name="data")
	private DataOfWeather data;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getWeatherRequest")
	@ResponsePayload
	public GetWeatherResponse getCountry(@RequestPayload GetWeatherRequest request) {
		GetWeatherResponse response = new GetWeatherResponse();
		com.damek.weather.data.Weather w = data.findWeather(request.getWeatherLocation());
		ObjectMapper mapper = new ObjectMapper();
		Weather weather=null;
		try {
			weather = mapper.readValue(w.toString(), Weather.class);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		response.setWeather(weather);

		return response;
	}
}
