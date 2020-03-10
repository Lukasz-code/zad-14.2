package com.kodilla.good.paterns.challenges.zad131;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String moviesString = movieStore.getMovies().entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .collect(Collectors.joining(" ! ", " ", " "));

        System.out.println(moviesString);
    }
}
