package com.test.weatherApp.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Location {

    private String code;
    private String city;
    private String country;
    private Double latitude;
    private Double longitude;

}
