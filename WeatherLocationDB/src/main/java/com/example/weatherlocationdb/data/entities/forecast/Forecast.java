package com.example.weatherlocationdb.data.entities.forecast;

import lombok.*;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class Forecast {
    private Location location;
    private Current current;
}
