package com.example.weatherlocationdb.data.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter(AccessLevel.PRIVATE)
@Entity
@Table(name = "type")
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idType;
    private String typeName;

    @OneToMany(mappedBy = "type")

    private Set<Place> places = new HashSet<>();

    public Type(String typeName) {
        this.typeName = typeName;
    }
}
