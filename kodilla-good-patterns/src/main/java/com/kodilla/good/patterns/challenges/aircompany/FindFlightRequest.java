package com.kodilla.good.patterns.challenges.aircompany;

import lombok.ToString;
import lombok.Getter;

@ToString
@Getter
public class FindFlightRequest {

    private AirlineData airlineData;
    private String findDeparture;
    private String findArrival;
    private String findThough;
    private String typeOfInquiry;

    public FindFlightRequest(AirlineData airline, String findDeparture, String findArrival, String findThough, String typeOfInquiry) {
        this.airlineData = airline;
        this.findDeparture = findDeparture;
        this.findArrival = findArrival;
        this.findThough = findThough;
        this.typeOfInquiry = typeOfInquiry;
    }
}
