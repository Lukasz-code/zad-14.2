package com.kodilla.good.paterns.challenges.zad132;

import java.time.LocalDateTime;

public class SellRequest {
    private User user;
    private LocalDateTime buyDate;
    private LocalDateTime deliveryDate;
    private Product product;

    public SellRequest(User user, LocalDateTime buyDate, LocalDateTime deliveryDate, Product product) {
        this.user = user;
        this.buyDate = buyDate;
        this.deliveryDate = deliveryDate;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getBuyDate() {
        return buyDate;
    }

    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }

    public Product getProduct() {
        return product;
    }
}
