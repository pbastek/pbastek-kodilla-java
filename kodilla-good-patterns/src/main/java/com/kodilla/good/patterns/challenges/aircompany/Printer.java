package com.kodilla.good.patterns.challenges.aircompany;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Printer implements PrintService {

    DateTimeFormatter dataTimeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public void printFlightDeparture(ToPrintFlightsDto toPrintFlightsDto) {
        System.out.println("******************************");
        System.out.println("All flights FROM " + toPrintFlightsDto.getAirportNameDeparture());
        System.out.printf("%17s|  %15s| %15s| %20s| %20s|\n", "Flight number", "Departure", "Arrival", "ToD", "ToA");

        for (Flight flight : toPrintFlightsDto.getTemporarySet()) {
            System.out.printf("%17s|  %15s| %15s| %20s| %20s| \n", flight.getFlightNumber(), flight.getDepartureAirport(),
                    flight.getArrivalAirport(), flight.getDepartureTime().format(dataTimeFormat),
                    flight.getArrivalTime().format(dataTimeFormat));
        }

    }

    public void printFlightArrival(ToPrintFlightsDto toPrintFlightsDto) {
        System.out.println("******************************");
        System.out.println("All flights TO " + toPrintFlightsDto.getAirportNameDeparture());
        System.out.printf("%17s|  %15s| %15s| %20s| %20s|\n", "Flight number", "Departure", "Arrival", "ToD", "ToA");

        for (Flight flight : toPrintFlightsDto.getTemporarySet()) {
            System.out.printf("%17s|  %15s| %15s| %20s| %20s| \n", flight.getFlightNumber(), flight.getDepartureAirport(),
                    flight.getArrivalAirport(), flight.getDepartureTime().format(dataTimeFormat),
                    flight.getArrivalTime().format(dataTimeFormat));
        }

    }

    public void printFlightThrough(ToPrintFlightsDto toPrintFlightsDto) {
        System.out.println("******************************");
        System.out.println("All flights FROM " + toPrintFlightsDto.getAirportNameDeparture() +
                " THROUGH " + toPrintFlightsDto.getAirportNameThrough() +
                " TO " + toPrintFlightsDto.getAirportNameArrival());
        System.out.printf("%17s|  %15s| %15s| %20s| %20s|\n", "Flight number", "Departure", "Arrival", "ToD", "ToA");

        for (Set<Flight> set : toPrintFlightsDto.getListOfFlightSet()) {
            Set<Flight> testSet = set.stream()
                    .collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Flight::getArrivalTime))));

            System.out.println("###### Possible connection: ");
            for (Flight flight : testSet) {
                System.out.printf("%17s|  %15s| %15s| %20s| %20s| \n", flight.getFlightNumber(), flight.getDepartureAirport(),
                        flight.getArrivalAirport(), flight.getDepartureTime().format(dataTimeFormat),
                        flight.getArrivalTime().format(dataTimeFormat));
            }
        }
    }
}
