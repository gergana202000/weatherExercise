package com.example.weatherlocationdb.data.services.interfaces;

import com.example.weatherlocationdb.api.models.WeatherRequest;
import com.example.weatherlocationdb.api.models.WeatherResponse;
import com.example.weatherlocationdb.data.entities.Place;

public interface IPlaceService {
    WeatherResponse getWeatherByLocation(WeatherRequest weatherRequest);
}
