package com.kodilla.spring.calculator;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double val1 = calculator.add(10.0,5.0);
        double val2 = calculator.sub( 10,5);
        double val3 = calculator.div(10,5);
        double val4 = calculator.mul(10,5);
        //Then
        Assert.assertEquals(15.0, val1,0.01);
        Assert.assertEquals(5.0, val2,0.01);
        Assert.assertEquals(2.0, val3,0.01);
        Assert.assertEquals(50.0, val4,0.01);



    }
}
