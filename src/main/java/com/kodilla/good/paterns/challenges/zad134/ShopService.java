package com.kodilla.good.paterns.challenges.zad134;

import java.util.Map;

public interface ShopService {
    Map<String, Integer> stanMagazynowy();

    default boolean process(Product product) {

        Integer quantity = stanMagazynowy().get(product.getProductName());

        if (quantity < product.getAmount()) {

            Integer newQuantity = quantity - product.getAmount();
            stanMagazynowy().put(product.getProductName(), newQuantity);
            return true;

        } else {
            System.out.println("nie ma wymaganej ilosci w sklepie");
            return false;
        }
    }
}
