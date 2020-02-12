package com.kodilla.good.paterns.challenges.zad134;

import java.time.LocalDateTime;

public class Delivery implements DeliveryService {

    private ProductsWarehouse productsWarehouse;

    public Delivery(ProductsWarehouse productsWarehouse) {

        this.productsWarehouse = productsWarehouse;
    }

    public Delivery() {

    }

    @Override
    public boolean delivery(Customer customer, LocalDateTime deliveryDate, OrderList orderList) {

        for (Product product : orderList.getCustomerOrder()) {

            if (productsWarehouse.productsToChoose().containsKey(product)) {

                Shop shop = productsWarehouse.productsToChoose().get(product);
                System.out.println("działa");

//               shop.
                return true;
            }
        }
        return false;
    }
}