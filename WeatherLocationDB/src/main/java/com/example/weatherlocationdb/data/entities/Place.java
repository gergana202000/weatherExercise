package com.example.weatherlocationdb.data.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table (name="place")
@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String placeName;
    @ManyToOne
    @JoinColumn( name = "idCountry")
    private Country country;

    private Double longitude;
    private Double latitude;

   @ManyToOne
    @JoinColumn(name = "idType")
    private Type type;

    public Place(String placeName, Country country, Double longitude, Double latitude, Type type) {
        this.placeName = placeName;
        this.country = country;
        this.longitude = longitude;
        this.latitude = latitude;
        this.type = type;
    }
}
