package com.kodilla.good.paterns.challenges.zad134;

public class Product {

    private String productName;
    private Integer amount;

    public Product(String productName, Integer amount) {
        this.productName = productName;
        this.amount = amount;
    }

    public String getProductName() {
        return productName;
    }

    public Integer getAmount() {
        return amount;
    }
}
