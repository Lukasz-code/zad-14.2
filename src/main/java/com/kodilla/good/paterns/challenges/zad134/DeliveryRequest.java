package com.kodilla.good.paterns.challenges.zad134;

import java.time.LocalDateTime;

public class DeliveryRequest {
    private Customer customer;
    private OrderList orderList;
    LocalDateTime deliveryDate;

    public DeliveryRequest(Customer customer, OrderList orderList, LocalDateTime deliveryDate) {
        this.customer = customer;
        this.orderList = orderList;
        this.deliveryDate = deliveryDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public OrderList getOrderList() {
        return orderList;
    }

    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }
}
