package com.kodilla.good.paterns.challenges.zad134;

import java.time.LocalDateTime;

public class Delivery implements DeliveryService {

    private ProductsWarehouse productsWarehouse;

    public Delivery(ProductsWarehouse productsWarehouse) {
        this.productsWarehouse = productsWarehouse;
    }


    @Override
    public boolean delivery(Customer customer, LocalDateTime deliveryDate, OrderList orderList) {

        for (Product product : orderList.getCustomerOrder()) {

            if (productsWarehouse.productsToChoose().containsKey(product)) {

                ShopService shopService = productsWarehouse.productsToChoose().get(product);

               shopService.process(product);

            }
        }
        return true;
    }
}