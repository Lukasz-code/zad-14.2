package com.kodilla.good.paterns.challenges.zad132;

public class SellingDTO {

    private User user;
    private Product product;
    private boolean isSold;

    public SellingDTO(User user, Product product, boolean isSold) {
        this.user = user;
        this.product = product;
        this.isSold = isSold;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isSold() {
        return isSold;
    }
}
