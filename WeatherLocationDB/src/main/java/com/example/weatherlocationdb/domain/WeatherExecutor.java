package com.example.weatherlocationdb.domain;

import com.example.weatherlocationdb.api.models.WeatherRequest;
import com.example.weatherlocationdb.api.models.WeatherResponse;
import com.example.weatherlocationdb.data.services.PlaceService;
import com.example.weatherlocationdb.domain.interfaces.IWeatherExecutor;

public class WeatherExecutor implements IWeatherExecutor {
    private PlaceService placeService;

    public WeatherExecutor(PlaceService placeService) {
        this.placeService = placeService;
    }

    @Override
    public WeatherResponse execute(WeatherRequest weatherRequest) {
        return placeService.getWeatherByLocation(weatherRequest);
    }
}
