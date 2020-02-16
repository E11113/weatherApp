package com.test.weatherApp.service;

import com.test.weatherApp.model.Location;
import com.test.weatherApp.model.Weather;

import java.util.List;

public interface WeatherService {

    List<Location> getLocations();
    List<Weather> getWeather(String code);
}
