
package com.test.weatherApp.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Currently {

    private Integer time;
    private String summary;
    private String icon;
    private Double precipIntensity;
    private Double precipProbability;
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
    private Integer cloudCover;
    private Integer uvIndex;
    private Integer visibility;
    private Integer ozone;

}
