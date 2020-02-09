package com.kodilla.good.paterns.challenges.zad134;

public class Customer {
    private String fullName;
    private String adress;

    public Customer(String fullName, String adres) {
        this.fullName = fullName;
        this.adress = adres;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAdress() {
        return adress;
    }
}
