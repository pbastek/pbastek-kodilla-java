
package com.kodilla.exception.test;

public class LookingForFlightRunner {

    public static void main(String[] args){
        Flight flight = new Flight("Rome", "Berlin");

        LookingForFlight lookingFor = new LookingForFlight();
        try {
            System.out.println(lookingFor.findFilght(flight));
        } catch (RouteNotFoundException e) {
            System.out.println("The arrival airport does not exist in the system!");
        }
    }
}
