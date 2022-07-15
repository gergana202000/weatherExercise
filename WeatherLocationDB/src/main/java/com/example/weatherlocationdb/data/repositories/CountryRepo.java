package com.example.weatherlocationdb.data.repositories;

import com.example.weatherlocationdb.data.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepo extends JpaRepository<Country, Long> {
    Country getCountryByName(String countryName);
}
