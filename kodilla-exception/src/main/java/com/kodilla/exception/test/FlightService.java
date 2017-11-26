
package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;
import java.lang.String;
import lombok.NonNull;
import lombok.Getter;

@Getter
public class FlightService {

    private Map<String, Boolean> destinationAirport = new HashMap<>();


    public FlightService() {
        destinationAirport.put("New York", true);
        destinationAirport.put("Paris", true);
    }

    public boolean findFlight(@NonNull Flight flight) throws RouteNotFoundException {

        if (destinationAirport.containsKey(flight.arrivalAirport)) {
            return destinationAirport.get(flight.arrivalAirport);
        } else {
            throw new RouteNotFoundException();
        }
    }
}