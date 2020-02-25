package com.kodilla.good.paterns.challenges.zad135;

public class User {

    private String userName;
    private String userPhonenumber;

    public User(String userName, String userPhonenumber) {
        this.userName = userName;
        this.userPhonenumber = userPhonenumber;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPhonenumber() {
        return userPhonenumber;
    }
}
