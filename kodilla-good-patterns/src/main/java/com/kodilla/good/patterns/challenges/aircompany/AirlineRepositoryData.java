package com.kodilla.good.patterns.challenges.aircompany;

import java.util.Set;

public class AirlineRepositoryData implements RepositoryService {

    public Set<Flight> loadAirlineData(AirlineData airlineData) {
        return airlineData.getFlightMap();
    }
}
