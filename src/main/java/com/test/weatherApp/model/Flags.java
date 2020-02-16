
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
public class Flags {

    private List<String> sources = null;
    private Double nearestStation;
    private String units;

}
