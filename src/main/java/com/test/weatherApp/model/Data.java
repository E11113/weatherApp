
package com.test.weatherApp.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Data {

    private Double latitude;
    private Double longitude;
    private String timezone;
    private Currently currently;
    private Hourly hourly;
    private Daily daily;
    private Flags flags;
    private Integer offset;

}
