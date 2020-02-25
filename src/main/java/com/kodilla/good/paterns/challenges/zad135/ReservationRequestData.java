package com.kodilla.good.paterns.challenges.zad135;

public class ReservationRequestData {

    public ReservationRequest data (){

        User user = new User ("John Kowalsky", "500200300");
        Flight flight = new Flight("Warszawa", "Lublin");

        return new ReservationRequest(user, flight);
    }
}
