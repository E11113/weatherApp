package com.test.weatherApp.controller;

import com.test.weatherApp.model.Location;
import com.test.weatherApp.model.LocationForm;
import com.test.weatherApp.model.Weather;
import com.test.weatherApp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class WeatherController {


    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weatherboard")
    public String weatherboardInit(Model model) {

        LocationForm locationForm = new LocationForm();
        model.addAttribute("locationForm", locationForm);
        model.addAttribute("locations", weatherService.getLocations());
        return "weatherboard";
    }

    @PostMapping("/weatherboard")
    public void getWeather(LocationForm locationForm, Model model) {

        List<Location> locations = weatherService.getLocations();
        List<Weather> weathers = weatherService.getWeather(locationForm.getSelectedLocation());
        model.addAttribute("locationForm", locationForm);
        model.addAttribute("locations", locations);
        model.addAttribute("details", weathers);
    }
}
