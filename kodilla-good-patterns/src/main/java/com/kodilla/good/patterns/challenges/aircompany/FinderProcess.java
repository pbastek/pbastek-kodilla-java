package com.kodilla.good.patterns.challenges.aircompany;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

enum TypeOfRequest {
    FROM, TO, THROUGH
}

public class FinderProcess {

    private PrintService printService;
    private RepositoryService repositoryService;


    public FinderProcess(PrintService printService, RepositoryService repositoryService) {
        this.printService = printService;
        this.repositoryService = repositoryService;
    }

    public void findFlightDistributor(FindFlightRequest findFlightRequest) {

        TypeOfRequest e = TypeOfRequest.valueOf(findFlightRequest.getTypeOfInquiry());
        switch (e) {
            case TO: {
                this.findFlightArrival(findFlightRequest);
                break;
            }
            case FROM: {
                this.findFlightDeparture(findFlightRequest);
                break;
            }
            case THROUGH: {
                this.findFlightThrough(findFlightRequest);
                break;
            }
        }
    }

    public void findFlightDeparture(FindFlightRequest findFlightRequest) {

        Set<Flight> setToPrint = repositoryService.loadAirlineData(findFlightRequest.getAirlineData()).stream()
                .filter(flight -> flight.getDepartureTime().isAfter(LocalDateTime.now()))
                .filter(flight -> flight.getDepartureAirport().equals(findFlightRequest.getFindDeparture()))
                .collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Flight::getArrivalTime))));

        printService.printFlightDeparture(new ToPrintFlightsDto(null, setToPrint, findFlightRequest.getFindDeparture(), null, null));
    }

    public void findFlightArrival(FindFlightRequest findFlightRequest) {

        Set<Flight> setToPrint = repositoryService.loadAirlineData(findFlightRequest.getAirlineData()).stream()
                .filter(flight -> flight.getDepartureTime().isAfter(LocalDateTime.now()))
                .filter(flight -> flight.getArrivalAirport().equals(findFlightRequest.getFindArrival()))
                .collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Flight::getArrivalTime))));

        printService.printFlightArrival(new ToPrintFlightsDto(null, setToPrint, findFlightRequest.getFindArrival(), null, null));
    }

    public void findFlightThrough(FindFlightRequest findFlightRequest) {

        Set<Flight> finalOfSet = new HashSet<>();
        List<Set<Flight>> listToPrint = new ArrayList<>();
        Set<Flight> setFirstPart = repositoryService.loadAirlineData(findFlightRequest.getAirlineData()).stream()
                .filter(flight -> flight.getDepartureAirport().equals(findFlightRequest.getFindDeparture()) &&
                        flight.getArrivalAirport().equals(findFlightRequest.getFindThough()))
                .filter(flight -> flight.getDepartureTime().isAfter(LocalDateTime.now()))
                .collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Flight::getArrivalTime))));

        for (Flight secondFlight : setFirstPart) {
            finalOfSet.add(secondFlight);
            Set<Flight> setSecondPart = repositoryService.loadAirlineData(findFlightRequest.getAirlineData()).stream()
                    .filter(flight -> flight.getDepartureAirport().equals(findFlightRequest.getFindThough()) &&
                            flight.getArrivalAirport().equals(findFlightRequest.getFindArrival()))
                    .filter(flight -> secondFlight.getDepartureTime().isBefore(flight.getArrivalTime()))
                    .collect(Collectors.toSet());

            if (setFirstPart.size() > 0 && setSecondPart.size() > 0) {

                finalOfSet.addAll(setSecondPart);
                listToPrint.add(finalOfSet);
                finalOfSet = new HashSet<>();
            }
        }
        printService.printFlightThrough(new ToPrintFlightsDto(listToPrint, null, findFlightRequest.getFindArrival(), findFlightRequest.getFindArrival(), findFlightRequest.getFindThough()));
    }
}
