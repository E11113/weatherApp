
package com.test.weatherApp.model;

import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Daily {

    private String summary;
    private String icon;
    private List<Datum_> data = null;

}
