package com.kodilla.good.paterns.challenges.zad135;

import java.util.Objects;

public final class Flight {

    private final String from;
    private final String to;

    public Flight(final String from, final String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(from, flight.from) &&
                Objects.equals(to, flight.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }
}
