package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;
import java.math.BigDecimal;

public class World {
    private final Set<Continent> continents;

    public World() {
        this.continents = new HashSet<>();
    }

    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    public Set<Continent> getContinents() {
        return continents;
    }

    public BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}