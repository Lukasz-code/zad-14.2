package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void openLog () {
        Logger.getInstance().log("cos.tam");
    }
    @Test
    public void testLog() {
        //When
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println("Log: [" + lastLog + "]");
        //Then
        Assert.assertEquals("cos.tam", lastLog);


    }

}
