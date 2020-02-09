package com.kodilla.good.paterns.challenges.zad134;

import java.time.LocalDateTime;

public interface SystemRepository {

    void createDeliveryRepository(Customer customer, OrderList orderList, LocalDateTime deliveryDate);
}
