package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {

    @Test
    public void TestBigMacNew (){
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun("bun")
                .burgers(2)
                .sauce("standard")
                .ingredient("onion")
                .ingredient("mushrooms")
                .ingredient("jalapenio")
                .ingredient("becon")
                .build();
        System.out.println(bigMac);
        //When
        int howManyIngredients = bigMac.getIngredients().size();
        int howManyBurgers = bigMac.getBurgers();
        //Then
        Assert.assertEquals(4, howManyIngredients);
        Assert.assertEquals(2, howManyBurgers);
    }
}
