package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    private static Logger logger;

    @BeforeClass
    public static void openLog () {
        Logger.getInstance().log("cos.tam");
    }

    private static Logger logger() {
        return logger;
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
