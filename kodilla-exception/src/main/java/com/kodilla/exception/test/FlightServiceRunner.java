
package com.kodilla.exception.test;

import java.lang.String;

public class FlightServiceRunner {

    public static void main(String[] args){

        FlightService flightService = new FlightService();
        try {
            System.out.println(flightService.findFlight(new Flight("Rome", "Berlin")));
        } catch (RouteNotFoundException e) {
            System.out.println("The arrival airport does not exist in the system!");
        }
    }
}