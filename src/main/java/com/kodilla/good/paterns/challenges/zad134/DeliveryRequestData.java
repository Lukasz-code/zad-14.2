package com.kodilla.good.paterns.challenges.zad134;

import java.time.LocalDateTime;

public class DeliveryRequestData {

    public DeliveryRequest data() {

        Customer customer = new Customer("Dan McDan", "kiele Paczesiów");
        OrderList orderList = new OrderList();
        orderList.add(new Product("Eco Salad", 1));
        orderList.add(new Product("Gluten Free Bread", 2));
        orderList.add(new Product("fat free cheese", 1));

        LocalDateTime deliveryDate = LocalDateTime.of(2020, 02, 20, 16, 00);

        return new DeliveryRequest(customer, orderList, deliveryDate);
    }


}
