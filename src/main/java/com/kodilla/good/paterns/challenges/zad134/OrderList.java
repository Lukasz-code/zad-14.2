package com.kodilla.good.paterns.challenges.zad134;

import java.util.ArrayList;
import java.util.List;

public class OrderList {

    private List<Product> customerOrder = new ArrayList<>();

    public void add(Product product) {

        customerOrder.add(product);
    }

    public List<Product> getCustomerOrder() {
        return customerOrder;
    }
}
