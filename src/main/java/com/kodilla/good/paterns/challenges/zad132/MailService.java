package com.kodilla.good.paterns.challenges.zad132;

public class MailService implements InformationService{

    public boolean inform (User user, Product product) {
        System.out.println("Email send to: " + user.getEmailAdress());
        System.out.println("Email title : " + product.getKatalogNumber());
        return true;
    }
}
