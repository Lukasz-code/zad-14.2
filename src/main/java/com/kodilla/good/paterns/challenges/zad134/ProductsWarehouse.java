package com.kodilla.good.paterns.challenges.zad134;

import java.util.HashMap;
import java.util.Map;

public class ProductsWarehouse {

    public Map<Product, Shop> productsToChoose () {

        Shop shop1 = new Shop(" ExtraFoodShop");
        Shop shop2 = new Shop("HealthyShop");
        Shop shop3 = new Shop("GlutenFreeShop");

        Product salad = new Product("Eco Salad");
        Product tomatoe = new Product("Eco Tomatoe");
        Product potatoe = new Product("Eco Potatoe");
        Product bread = new Product("Gluten Free Bread");
        Product flour = new Product("Gluten Free Flour");
        Product biscuits = new Product("Gluten Free Biscuits");
        Product yogurt = new Product("0% fat yogurt");
        Product cheese = new Product("fat free cheese");
        Product milk = new Product("0% fat milk");

        Map<Product, Shop> productsToChoose = new HashMap<>();

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
