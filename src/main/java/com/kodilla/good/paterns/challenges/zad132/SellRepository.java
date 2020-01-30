package com.kodilla.good.paterns.challenges.zad132;

import java.time.LocalDateTime;

public interface SellRepository {

    void createSellRepository (User user, LocalDateTime buyDate, LocalDateTime deliveryDate, Product product);
}
