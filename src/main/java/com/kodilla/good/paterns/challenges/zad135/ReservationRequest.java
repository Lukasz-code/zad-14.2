package com.kodilla.good.paterns.challenges.zad135;

public class ReservationRequest {

    private User user;
    private Flight flight;

    public ReservationRequest(User user, Flight flight) {
        this.user = user;
        this.flight = flight;
    }

    public User getUser() {
        return user;
    }

    public Flight getFlight() {
        return flight;
    }
}
