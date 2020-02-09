package com.kodilla.good.paterns.challenges.zad134;

public class deliveringDTO {
    private Customer customer;
    private OrderList orderList;
    boolean isDelivered;

    public deliveringDTO(Customer customer, OrderList orderList, boolean isDelivered) {
        this.customer = customer;
        this.orderList = orderList;
        this.isDelivered = isDelivered;
    }

    public Customer getCustomer() {
        return customer;
    }

    public OrderList getOrderList() {
        return orderList;
    }

    public boolean isDelivered() {
        return isDelivered;
    }
}
