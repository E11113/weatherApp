package com.test.weatherApp.service.impl;

import com.test.weatherApp.model.Data;
import com.test.weatherApp.model.Location;
import com.test.weatherApp.model.Weather;
import com.test.weatherApp.repository.WeatherRepository;
import com.test.weatherApp.service.WeatherService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class WeatherServiceImpl implements WeatherService {

    private HashMap<String,Location> locationsMap;

    private final RestTemplate restTemplate;
    private final WeatherRepository weatherRepository;

    public WeatherServiceImpl(RestTemplate restTemplate, WeatherRepository weatherRepository) {
        this.restTemplate = restTemplate;
        this.weatherRepository = weatherRepository;
    }

    @PostConstruct
    public void init() {

        this.locationsMap = new HashMap<>();
        this.locationsMap.put("CA", new Location("CA","Campbell","CA", 37.29, 121.95));
        this.locationsMap.put("NE", new Location("NE","Omaha","NE", 41.26, 95.93));
        this.locationsMap.put("TX", new Location("TX","Austin","TX", 30.27, 97.74));
        this.locationsMap.put("JPN_NI", new Location("JPN_NI","Niseko","Japan", 42.80, 140.69));
        this.locationsMap.put("JPN_NA", new Location("JPN_NA","Nara","Japan", 34.69, 135.80));
        this.locationsMap.put("INDO", new Location("INDO","Jakarta","Indonesia", 6.20, 106.85));

    }

    public List<Location> getLocations() {

        Iterator hmIterator = locationsMap.entrySet().iterator();
        List<Location> locations = new ArrayList<>();

        while (hmIterator.hasNext()) {
            HashMap.Entry mapElement = (HashMap.Entry)hmIterator.next();
            locations.add((Location)mapElement.getValue());
        }
        return locations;
    }

    public List<Weather> getWeather(String code) {

        String uniqueID = UUID.randomUUID().toString();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Location selectedLoc = locationsMap.get(code);
        String url = String.format("https://api.darksky.net/forecast/%s/%s,%s", "1951e3836f2094eba57ae21f117053ae", selectedLoc.getLatitude(), selectedLoc.getLongitude());
        Data response = restTemplate.getForObject(url, Data.class);

        Weather weather = new Weather();
        weather.setId(uniqueID);
        weather.setLatitude(selectedLoc.getLatitude());
        weather.setLongitude(selectedLoc.getLongitude());
        weather.setCreatedAt(new Date());
        weather.setDate(simpleDateFormat.format(new Date()));
        weather.setData(response);
        weatherRepository.save(weather);

        String dateStr = simpleDateFormat.format(new Date());
        List<Weather> weathers = weatherRepository.findByLatitudeAndLongitudeAndDate(selectedLoc.getLatitude(), selectedLoc.getLongitude(), dateStr);
        return weathers;
    }
}
