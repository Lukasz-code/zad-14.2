package com.kodilla.good.paterns.challenges.zad134;

import java.util.HashMap;
import java.util.Map;

public class ProductsWarehouse {

    public Map<ProductsRepository, ShopsRepository> ProductsToChoose () {

        ShopsRepository shop1 = new ShopsRepository(" ExtraFoodShop");
        ShopsRepository shop2 = new ShopsRepository("HealthyShop");
        ShopsRepository shop3 = new ShopsRepository("GlutenFreeShop");

        ProductsRepository salad = new ProductsRepository("Eco Salad");
        ProductsRepository tomatoe = new ProductsRepository("Eco Tomatoe");
        ProductsRepository potatoe = new ProductsRepository("Eco Potatoe");
        ProductsRepository bread = new ProductsRepository("Gluten Free Bread");
        ProductsRepository flour = new ProductsRepository("Gluten Free Flour");
        ProductsRepository biscuits = new ProductsRepository("Gluten Free Biscuits");
        ProductsRepository yogurt = new ProductsRepository("0% fat yogurt");
        ProductsRepository cheese = new ProductsRepository("fat free cheese");
        ProductsRepository milk = new ProductsRepository("0% fat milk");

        Map<ProductsRepository, ShopsRepository> productsToChoose = new HashMap<>();

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
