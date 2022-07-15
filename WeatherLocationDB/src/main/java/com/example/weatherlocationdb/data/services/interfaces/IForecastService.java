package com.example.weatherlocationdb.data.services.interfaces;

import com.example.weatherlocationdb.data.entities.forecast.Forecast;

public interface IForecastService {
    Forecast getForecast(Double longitude, Double latitude);
}
