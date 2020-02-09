package com.kodilla.good.paterns.challenges.zad134;

import java.time.LocalDateTime;

public interface DeliveryService {

    boolean delivery (Customer customer, LocalDateTime deliveryDate, OrderList orderList);

}
