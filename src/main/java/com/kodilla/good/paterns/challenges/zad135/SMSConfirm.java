package com.kodilla.good.paterns.challenges.zad135;

public class SMSConfirm {
    public void sendSMS(User user) {
        System.out.println("We confirm reservation of flight " + user.getUserName() + "Message send to number : " + user.getUserPhonenumber());
    }
}
