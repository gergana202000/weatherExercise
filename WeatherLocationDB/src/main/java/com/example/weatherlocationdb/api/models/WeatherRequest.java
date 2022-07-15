package com.example.weatherlocationdb.api.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class WeatherRequest {
    private String place;
    private String country;
}
