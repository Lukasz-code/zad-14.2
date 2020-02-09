package com.kodilla.good.paterns.challenges.zad134;

import java.time.LocalDateTime;

public interface InformationService {
    boolean sendInformation(Customer customer, LocalDateTime deliveryDate, OrderList orderList);
}
