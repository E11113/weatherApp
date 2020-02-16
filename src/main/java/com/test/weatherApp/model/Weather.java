package com.test.weatherApp.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "weather")
public class Weather {

    @Id
    private String id;
    private Double latitude;
    private Double longitude;
    private Date createdAt;
    private String date;
    private Data data;
}
