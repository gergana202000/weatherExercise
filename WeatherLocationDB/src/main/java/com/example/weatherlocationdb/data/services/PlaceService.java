package com.example.weatherlocationdb.data.services;

import com.example.weatherlocationdb.api.models.WeatherRequest;
import com.example.weatherlocationdb.api.models.WeatherResponse;
import com.example.weatherlocationdb.data.entities.Country;
import com.example.weatherlocationdb.data.entities.Place;
import com.example.weatherlocationdb.data.entities.forecast.Forecast;
import com.example.weatherlocationdb.data.repositories.CountryRepo;
import com.example.weatherlocationdb.data.repositories.PlaceRepo;
import com.example.weatherlocationdb.data.services.interfaces.IPlaceService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PlaceService implements IPlaceService {
    private CountryRepo countryRepo;
    private PlaceRepo placeRepo;
    private ForecastService forecastService;


    public PlaceService(CountryRepo countryRepo, PlaceRepo placeRepo, ForecastService forecastService) {
        this.countryRepo = countryRepo;
        this.placeRepo = placeRepo;
        this.forecastService = forecastService;
    }

    @Override
    public WeatherResponse getWeatherByLocation(WeatherRequest weatherRequest) {
        Country country = countryRepo.getCountryByName(weatherRequest.getCountry());
        System.out.println(country);
        if(country==null){
            throw new NullPointerException();
        }

        Place place = placeRepo.getPlaceByCountryAndName(country, weatherRequest.getPlace());
        System.out.println(place);
        if(place==null){
            throw  new NullPointerException();
        }
        Forecast forecast = forecastService.getForecast(place.getLongitude(), place.getLatitude());

        return WeatherResponse.builder()
                .placeName(place.getPlaceName())
                .typeName((place.getType().getTypeName()))
                .temp(String.valueOf(forecast.getCurrent().getTemp_c()))
                .build();
    }
}
