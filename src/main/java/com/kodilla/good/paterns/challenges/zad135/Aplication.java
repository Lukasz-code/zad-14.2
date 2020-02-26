package com.kodilla.good.paterns.challenges.zad135;

public class Aplication {
    public static void main(String[] args) {

       FlightReservation flightReservation = new FlightReservation();
       flightReservation.questionFrom("Bydgoszcz");
       flightReservation.questionTo("Warszawa");
       flightReservation.questionThrough("Warszawa", "Lublin");
    }
}
