package com.kodilla.good.paterns.challenges.zad134;

import java.util.HashMap;
import java.util.Map;

public class ProductsWarehouse {

    public Map<Product, ShopService> productsToChoose () {

        ShopService shop1 = new ExtraFoodShop();
        ShopService shop2 = new HealthyShop();
        ShopService shop3 = new GlutenFreeShop();

        Product salad = new Product("Eco Salad", 2);
        Product tomatoe = new Product("Eco Tomatoe", 2);
        Product potatoe = new Product("Eco Potatoe",3);
        Product bread = new Product("Gluten Free Bread",50);
        Product flour = new Product("Gluten Free Flour",1);
        Product biscuits = new Product("Gluten Free Biscuits",20);
        Product yogurt = new Product("0% fat yogurt",5);
        Product cheese = new Product("fat free cheese",7);
        Product milk = new Product("0% fat milk",5);

        Map<Product, ShopService> productsToChoose = new HashMap<>();

        productsToChoose.put(salad, shop1);
        productsToChoose.put(tomatoe, shop1);
        productsToChoose.put(potatoe, shop1);
        productsToChoose.put(bread, shop2);
        productsToChoose.put(flour, shop2);
        productsToChoose.put(biscuits, shop2);
        productsToChoose.put(yogurt, shop3);
        productsToChoose.put(cheese, shop3);
        productsToChoose.put(milk, shop3);

        return productsToChoose;
    }
}
