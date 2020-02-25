package com.kodilla.good.paterns.challenges.zad135;

import java.util.ArrayList;
import java.util.List;

public class FlightReservation {

    public List<Flight> questionFrom(String from){

        FlightDataBase.flightDataBase().stream()
                .filter(flight -> flight.getFrom().equals(from))
                .forEach(System.out::println);

        return new ArrayList<>();
    }

         public List<Flight> questionTo(String to){

        FlightDataBase.flightDataBase().stream()
                .filter(flight -> flight.getTo().equals(to))
                .forEach(System.out::println);

        return new ArrayList<>();
    }

    public List<Flight> questionThrough(String from, String to){

        List<Flight> flights = questionFrom(from);
        List<Flight> flights1 = questionTo(to);

        List<Flight> flightsThrough = new ArrayList<>();

        for (Flight fromFlight : flights)
            for (Flight toFlight: flights1)

                if (fromFlight.getTo().equals(toFlight.getFrom())) {

                    flightsThrough.add(fromFlight);
                    flightsThrough.add(toFlight);
                }

        return flightsThrough;
    }
}
