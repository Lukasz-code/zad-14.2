package com.kodilla.good.paterns.challenges.zad132;

import java.time.LocalDateTime;

public class ProductOrderService implements SellService {

    public static void createProductOrder(User user, Product product) {
        System.out.println("Information for warehouse : ");
        System.out.println("Adress to send: " + user.getHomeAdress() + " Product to send: " + product.getKatalogNumber());
    }


    public boolean sell(final User user, final LocalDateTime buyDate, final LocalDateTime deliveryDate, final Product product) {
        System.out.println("Article bought by:" + user.getName() + user.getSurname() + " At: " + buyDate.toString() + " will be delivered : " + deliveryDate.toString() + " to: " + user.getHomeAdress());
        System.out.println("Ordered product " + product.getKatalogNumber());

        return true;
    }
}
