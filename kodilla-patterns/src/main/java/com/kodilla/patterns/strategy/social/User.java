package com.kodilla.patterns.strategy.social;

public class User {
    final private String name;
    protected SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String whereToPublish(){
        return socialPublisher.share();
    }

    public void setSocialMedia(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
