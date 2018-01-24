package com.kodilla.good.patterns.challenges.aircompany;
import java.util.Set;

public interface RepositoryService {

    Set<Flight> loadAirlineData(AirlineData airlineData);
}
