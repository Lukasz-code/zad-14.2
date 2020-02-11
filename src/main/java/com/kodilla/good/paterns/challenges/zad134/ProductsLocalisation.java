package com.kodilla.good.paterns.challenges.zad134;

import java.util.Objects;

public class ProductsLocalisation {

    String productName;
    String shop;

    public ProductsLocalisation(String productName, String shop) {
        this.productName = productName;
        this.shop = shop;
    }

    public String getProductName() {
        return productName;
    }

    public String getShop() {
        return shop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductsLocalisation that = (ProductsLocalisation) o;
        return Objects.equals(productName, that.productName) &&
                Objects.equals(shop, that.shop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, shop);
    }
}
