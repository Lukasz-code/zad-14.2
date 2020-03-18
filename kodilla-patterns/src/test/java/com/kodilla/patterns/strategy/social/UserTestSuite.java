package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User millenials = new Millenials("X");
        User yGeneration = new YGeneration(("Y"));
        User zGeneration = new ZGeneration("Z");

        //When
        String xUsing = millenials.whereToPublish();
        System.out.println("millenials: " + xUsing);

        String yUsing = yGeneration.whereToPublish();
        System.out.println("yGeneration :" + yUsing);

        String zUsing = zGeneration.whereToPublish();
        System.out.println("zGeneration: " + zUsing);

        //Then
        Assert.assertEquals("twitter", xUsing);
        Assert.assertEquals("facebook", yUsing);
        Assert.assertEquals("snapczat", zUsing);

    }
    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User millenials = new Millenials("X");

        //When
        String xUsing = millenials.whereToPublish();
        System.out.println("millenials: " + xUsing);
        millenials.setSocialMedia(new FacebookPublisher());
        xUsing = millenials.whereToPublish();
        System.out.println("millenials now using: " + xUsing + " as a social media");

        //Then
        Assert.assertEquals("facebook",xUsing);
    }
}
