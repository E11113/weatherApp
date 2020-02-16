package com.test.weatherApp.repository;

import com.test.weatherApp.model.Weather;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface WeatherRepository extends MongoRepository<Weather, String> {

    List<Weather> findByLatitudeAndLongitude(Double latitude, Double longitude);
    List<Weather> findByLatitudeAndLongitudeAndDate(Double latitude, Double longitude, String date);
}
