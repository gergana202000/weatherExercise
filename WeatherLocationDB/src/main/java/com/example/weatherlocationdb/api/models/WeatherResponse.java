package com.example.weatherlocationdb.api.models;

import lombok.*;

import javax.persistence.Basic;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class WeatherResponse {
    private String placeName;
    private String typeName;
    private String temp;
}
