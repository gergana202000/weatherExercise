package com.example.weatherlocationdb.domain.interfaces;

import com.example.weatherlocationdb.api.models.WeatherRequest;
import com.example.weatherlocationdb.api.models.WeatherResponse;

public interface IWeatherExecutor {
    WeatherResponse execute(WeatherRequest weatherRequest);
}
