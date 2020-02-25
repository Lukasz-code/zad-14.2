package com.kodilla.good.paterns.challenges.zad135;

public class Aplication {
    public static void main(String[] args) {
        ReservationRequestData reservationRequestData = new ReservationRequestData();
        ReservationRequest reservationRequest = reservationRequestData.data();

       FlightReservation flightReservation = new FlightReservation(reservationRequest);
       flightReservation.questionFrom();
       flightReservation.questionTo();
       flightReservation.questionThrough();
    }
}
