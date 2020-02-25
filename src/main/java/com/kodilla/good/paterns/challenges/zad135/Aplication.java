package com.kodilla.good.paterns.challenges.zad135;

public class Aplication {
    public static void main(String[] args) {

       FlightReservation flightReservation = new FlightReservation();
       flightReservation.questionFrom("Warszawa");
       flightReservation.questionTo("Lublin");
       flightReservation.questionThrough("Warszawa", "Lublin");
    }
}
