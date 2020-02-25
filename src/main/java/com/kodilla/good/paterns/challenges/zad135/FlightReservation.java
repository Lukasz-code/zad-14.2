package com.kodilla.good.paterns.challenges.zad135;

public class FlightReservation {

    private ReservationRequest reservationRequest;

    public FlightReservation(ReservationRequest reservationRequest) {
        this.reservationRequest = reservationRequest;
    }

    public String questionFrom(){

        FlightDataBase.flightDataBase().stream()
                .filter(flight -> flight.equals(reservationRequest.getFlight().getFrom()))
                .forEach(System.out::println);

        return new String();
    }

    public String questionTo(){

        FlightDataBase.flightDataBase().stream()
                .filter(flight -> flight.equals(reservationRequest.getFlight().getTo()))
                .forEach(System.out::println);

        return new String();
    }

    public String questionThrough(){

        FlightDataBase.flightDataBase().stream()
                .filter(flight -> flight.equals(reservationRequest.getFlight().getFrom()) || flight.equals(reservationRequest.getFlight().getTo()))
                .filter(flight -> flight.equals(reservationRequest.getFlight().getTo()) == flight.equals(reservationRequest.getFlight().getTo()))
                .forEach(System.out::println);

        return new String();
    }
}
