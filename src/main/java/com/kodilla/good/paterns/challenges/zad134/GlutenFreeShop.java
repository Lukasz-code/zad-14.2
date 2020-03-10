package com.kodilla.good.paterns.challenges.zad134;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements ShopService {
    @Override
    public Map<String, Integer> stanMagazynowy() {

        Map<String, Integer> stanMagazynowy = new HashMap<>();

        stanMagazynowy.put("Gluten Free Bread", 1);
        stanMagazynowy.put("Gluten Free Flour", 10);
        stanMagazynowy.put("Gluten Free Biscuits", 10);

        return stanMagazynowy;
    }

}
