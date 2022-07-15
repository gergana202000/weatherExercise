package com.example.weatherlocationdb.data.services;

import com.example.weatherlocationdb.data.entities.forecast.Forecast;
import com.example.weatherlocationdb.data.restTemplates.RestTemplateProvider;
import com.example.weatherlocationdb.data.services.interfaces.IForecastService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
@Primary
public class ForecastService implements IForecastService {
    private final RestTemplateProvider restTemplateProvider;

    public ForecastService(RestTemplateProvider restTemplateProvider) {
        this.restTemplateProvider = restTemplateProvider;
    }

    @Override
    public Forecast getForecast(Double longitude, Double latitude) {
        final String key = "c782585acdc84252b3790106220807";
        final String uri = "http://api.weatherapi.com/v1/current.json?key=" + key + "&q=" + latitude
                + "," + longitude;


        RestTemplate restTemplate =restTemplateProvider.getRestTemplate();
        return restTemplate.getForObject(uri, Forecast.class);
    }
}
