package com.kodilla.good.paterns.challenges.zad132;

import java.time.LocalDateTime;

public class SellRequestRetriver {

    public SellRequest retrive() {
        User user = new User("Zenon", "Bombalina","ul.Mostowa 20; 87-100 Torun; Poland", "myAccount@gmail.com");
        Product product = new Product("123456");

        LocalDateTime buyDate = LocalDateTime.of(2020,01, 28, 15, 10);
        LocalDateTime deliveryDate = LocalDateTime.of(2020,01,30, 16,00);

        return new SellRequest(user, buyDate, deliveryDate, product);
    }
}
