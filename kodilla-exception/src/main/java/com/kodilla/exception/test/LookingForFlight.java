
package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class LookingForFlight {

    public boolean findFilght(Flight flight) throws RouteNotFoundException {

        if (flight != null) {
            Map<String, Boolean> destinationAirport = new HashMap<>();
            destinationAirport.put("New York", true);
            destinationAirport.put("Paris", true);

            if (destinationAirport.containsKey(flight.arrivalAirport)) {
                return destinationAirport.get(flight.arrivalAirport);
            } else {
                throw new RouteNotFoundException();
            }
        }
        return false;
    }
}
