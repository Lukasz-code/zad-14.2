package com.kodilla.good.paterns.challenges.zad132;

public class User {
    private String name;
    private String surname;
    private String homeAdress;
    private String emailAdress;

    public User(String name, String surname, String homeAdress, String emailAdress) {
        this.name = name;
        this.surname = surname;
        this.homeAdress = homeAdress;
        this.emailAdress = emailAdress;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getHomeAdress() {
        return homeAdress;
    }

    public String getEmailAdress() {
        return emailAdress;
    }
}
