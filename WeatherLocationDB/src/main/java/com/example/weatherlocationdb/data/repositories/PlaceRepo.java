package com.example.weatherlocationdb.data.repositories;

import com.example.weatherlocationdb.data.entities.Country;
import com.example.weatherlocationdb.data.entities.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceRepo extends JpaRepository<Place, Long> {
    Place getPlaceByCountryAndName(Country countryName, String placeName);
}
