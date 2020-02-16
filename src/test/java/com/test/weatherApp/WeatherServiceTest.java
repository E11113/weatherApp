package com.test.weatherApp;

import com.test.weatherApp.model.Weather;
import com.test.weatherApp.service.impl.WeatherServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

@SpringBootTest
@ContextConfiguration
public class WeatherServiceTest {
    @Autowired
    private WeatherServiceImpl weatherServiceImpl;

    @Test
    public void testMongo(){
        List<Weather> weatherList = weatherServiceImpl.getWeather("CA");
    }

}
