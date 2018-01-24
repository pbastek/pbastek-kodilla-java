package com.kodilla.good.patterns.challenges.aircompany;

public interface PrintService {

    void printFlightDeparture(ToPrintFlightsDto toPrintFlightsDto);

    void printFlightArrival(ToPrintFlightsDto toPrintFlightsDto);

    void printFlightThrough(ToPrintFlightsDto toPrintFlightsDto);
}
