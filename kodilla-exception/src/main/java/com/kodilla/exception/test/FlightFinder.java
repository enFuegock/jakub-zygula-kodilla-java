package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    private final Map<String, Boolean> airports;

    public FlightFinder() {
        airports = new HashMap<>();
        airports.put("Warsaw", true);
        airports.put("Berlin", true);
        airports.put("Paris", false);
        airports.put("London", true);
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        if (!airports.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException("Route not found for airport: " + flight.getArrivalAirport());
        }
    }
}
