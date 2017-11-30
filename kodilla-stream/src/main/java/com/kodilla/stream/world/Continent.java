package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;
import lombok.NonNull;

public final class Continent {

    private final Set<Country> countries = new HashSet<>();

    public void addCountry(@NonNull Country country) {
            countries.add(country);
    }

    public Set<Country> getCountries() {
        return new HashSet<>(countries);
    }
}