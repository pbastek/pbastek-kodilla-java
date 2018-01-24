package com.kodilla.good.patterns.challenges.aircompany;

public class App {

    public static void main(String[] args) {

        FlightFindRequestRetriever flightFindRequestRetriver = new FlightFindRequestRetriever();
        FinderProcess finderProcess = new FinderProcess(new Printer(), new AirlineRepositoryData());

        FindFlightRequest findFlightRequest = flightFindRequestRetriver.retrieveDeparture();
        finderProcess.findFlightDistributor(findFlightRequest);

        findFlightRequest = flightFindRequestRetriver.retrieveArrival();
        finderProcess.findFlightDistributor(findFlightRequest);

        findFlightRequest = flightFindRequestRetriver.retrieveThrough();
        finderProcess.findFlightDistributor(findFlightRequest);
    }
}
