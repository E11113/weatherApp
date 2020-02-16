
package com.test.weatherApp.model;

import lombok.*;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Datum_ {

    private Integer time;
    private String summary;
    private String icon;
    private Integer sunriseTime;
    private Integer sunsetTime;
    private Integer moonPhase;
    private Double precipIntensity;
    private Double precipIntensityMax;
    private Integer precipIntensityMaxTime;
    private Double precipProbability;
    private String precipType;
    private Double precipAccumulation;
    private Double temperatureHigh;
    private Integer temperatureHighTime;
    private Double temperatureLow;
    private Integer temperatureLowTime;
    private Double apparentTemperatureHigh;
    private Integer apparentTemperatureHighTime;
    private Double apparentTemperatureLow;
    private Integer apparentTemperatureLowTime;
    private Double dewPoint;
    private Double humidity;
    private Double pressure;
    private Double windSpeed;
    private Double windGust;
    private Integer windGustTime;
    private Integer windBearing;
    private Double cloudCover;
    private Integer uvIndex;
    private Integer uvIndexTime;
    private Integer visibility;
    private Double ozone;
    private Double temperatureMin;
    private Integer temperatureMinTime;
    private Double temperatureMax;
    private Integer temperatureMaxTime;
    private Double apparentTemperatureMin;
    private Integer apparentTemperatureMinTime;
    private Double apparentTemperatureMax;
    private Integer apparentTemperatureMaxTime;

}
