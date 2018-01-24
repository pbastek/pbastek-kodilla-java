package com.kodilla.good.patterns.challenges.aircompany;

public class FlightFindRequestRetriever {

    AirlineData airlineData = new AirlineData("LOT");

    public FindFlightRequest retrieveDeparture() {

        return new FindFlightRequest(airlineData, "Warsaw", null, null, "FROM");
    }

    public FindFlightRequest retrieveArrival() {

        return new FindFlightRequest(airlineData, null, "Berlin", null, "TO");
    }

    public FindFlightRequest retrieveThrough() {

        return new FindFlightRequest(airlineData, "Warsaw", "Hamburg", "Berlin", "THROUGH");
    }
}
