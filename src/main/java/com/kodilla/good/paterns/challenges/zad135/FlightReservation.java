package com.kodilla.good.paterns.challenges.zad135;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightReservation {

    public List<Flight> questionFrom(String from){

        List<Flight> fromList = FlightDataBase.flightDataBase().stream()
                .filter(flight -> flight.getFrom().equals(from))
                .collect(Collectors.toList());
        for (Flight toFlights : fromList)
            System.out.println(toFlights);

        return fromList;
    }

         public List<Flight> questionTo(String to){

        List <Flight> toList = FlightDataBase.flightDataBase().stream()
                .filter(flight -> flight.getTo().equals(to))
                .collect(Collectors.toList());
        for (Flight toFlights : toList)
            System.out.println(toFlights);
        return toList;
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
