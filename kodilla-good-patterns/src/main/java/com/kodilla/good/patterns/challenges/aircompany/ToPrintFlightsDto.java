package com.kodilla.good.patterns.challenges.aircompany;

import java.util.List;
import java.util.Set;
import lombok.Getter;

@Getter
public class ToPrintFlightsDto {

    private List<Set<Flight>> listOfFlightSet;
    private Set<Flight> temporarySet;
    private String airportNameDeparture;
    private String airportNameArrival;
    private String airportNameThrough;

    public ToPrintFlightsDto(List<Set<Flight>> listOfFlightSet, Set<Flight> temporarySet, String airportNameDeparture, String airportNameArrival, String airportNameThrough) {
        this.listOfFlightSet = listOfFlightSet;
        this.temporarySet = temporarySet;
        this.airportNameDeparture = airportNameDeparture;
        this.airportNameArrival = airportNameArrival;
        this.airportNameThrough = airportNameThrough;
    }
}
