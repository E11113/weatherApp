
package com.test.weatherApp.model;

import lombok.*;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Datum {

    private Integer time;
    private String summary;
    private String icon;
    private Integer precipIntensity;
    private Integer precipProbability;
    private String precipType;
    private Double precipAccumulation;
    private Double temperature;
    private Double apparentTemperature;
    private Double dewPoint;
    private Double humidity;
    private Double pressure;
    private Double windSpeed;
    private Double windGust;
    private Integer windBearing;
    private Double cloudCover;
    private Integer uvIndex;
    private Integer visibility;
    private Double ozone;

}
