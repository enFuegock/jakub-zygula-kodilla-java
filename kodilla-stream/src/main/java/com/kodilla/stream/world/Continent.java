package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public class Continent {
    private final String name;
    private final Set<Country> countries;

    public Continent(String name) {
        this.name = name;
        this.countries = new HashSet<>();
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public Set<Country> getCountries() {
        return countries;
    }
}