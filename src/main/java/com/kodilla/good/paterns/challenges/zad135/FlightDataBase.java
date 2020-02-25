package com.kodilla.good.paterns.challenges.zad135;

import java.util.HashSet;
import java.util.Set;

public class FlightDataBase {

    public static Set<Flight> flightDataBase() {

        Flight Bydgoszcz1 = new Flight("Bydgoszcz", "Gdańsk");
        Flight Bydgoszcz2 = new Flight("Bydgoszcz", "Kraków");
        Flight Bydgoszcz3 = new Flight("Bydgoszcz", "Poznań");
        Flight Gdańsk1 = new Flight("Gdańsk", "Warszawa");
        Flight Gdańsk2 = new Flight("Gdańsk", "Lublin");
        Flight Gdańsk3 = new Flight("Gdańsk", "Wrocław");
        Flight Warszawa1 = new Flight("Warszawa","Wrocław");
        Flight Warszawa2 = new Flight("Warszawa","Bydgoszcz");
        Flight Warszawa3 = new Flight("Warszawa","Lublin");

        Set<Flight> DataBase = new HashSet<>();

        DataBase.add(Bydgoszcz1);
        DataBase.add(Bydgoszcz2);
        DataBase.add(Bydgoszcz3);
        DataBase.add(Gdańsk1);
        DataBase.add(Gdańsk2);
        DataBase.add(Gdańsk3);
        DataBase.add(Warszawa1);
        DataBase.add(Warszawa2);
        DataBase.add(Warszawa3);

        return DataBase;

    }

}
