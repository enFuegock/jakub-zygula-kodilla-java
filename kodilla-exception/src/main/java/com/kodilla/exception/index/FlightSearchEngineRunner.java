package com.kodilla.exception.index;

public class FlightSearchEngineRunner {
    public static void main(String[] args) {
        Flight flight = new Flight("Warsaw", "Rome");
        FlightFinder flightSearch = new FlightFinder();

        try {
            flightSearch.findFlight(flight);
            System.out.println("Flight available to: " + flight.getArrivalAirport());
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
