package com.kodilla.good.paterns.challenges.zad134;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements ShopService {

    @Override
    public Map<String, Integer> stanMagazynowy() {

        Map<String, Integer> stanMagazynowy = new HashMap<>();

        stanMagazynowy.put("0% fat yogurt", 10);
        stanMagazynowy.put("fat free cheese", 10);
        stanMagazynowy.put("0% fat milk", 10);

        return stanMagazynowy;
    }
}