
package com.test.weatherApp.model;

import lombok.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Hourly {

    private String summary;
    private String icon;
    private List<Datum> data = null;

}
