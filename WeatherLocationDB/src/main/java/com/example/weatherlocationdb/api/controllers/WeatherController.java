package com.example.weatherlocationdb.api.controllers;

import com.example.weatherlocationdb.api.models.WeatherRequest;
import com.example.weatherlocationdb.api.models.WeatherResponse;
import com.example.weatherlocationdb.domain.WeatherExecutor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class WeatherController {
    private final WeatherExecutor weatherExecutor;

    public WeatherController(WeatherExecutor weatherExecutor) {
        this.weatherExecutor = weatherExecutor;
    }

    @PostMapping("getWeather")
    public WeatherResponse getWeather(@RequestBody WeatherRequest weatherRequest){
        return weatherExecutor.execute(weatherRequest);
    }
}
