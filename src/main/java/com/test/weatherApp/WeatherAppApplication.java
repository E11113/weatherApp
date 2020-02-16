package com.test.weatherApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WeatherAppApplication {

	public static void main(String[] args) { SpringApplication.run(WeatherAppApplication.class, args); }

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
