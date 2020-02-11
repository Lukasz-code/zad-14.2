package com.kodilla.good.paterns.challenges.zad134;

public class ProductsRepository {

    String productName;

    public ProductsRepository(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }
}
