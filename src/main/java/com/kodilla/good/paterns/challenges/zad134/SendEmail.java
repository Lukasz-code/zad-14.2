package com.kodilla.good.paterns.challenges.zad134;

import java.time.LocalDateTime;

public class SendEmail implements InformationService {
    @Override
    public void sendInformation(Customer customer) {
        System.out.println("sending email to : " + customer.getFullName());
    }
}

