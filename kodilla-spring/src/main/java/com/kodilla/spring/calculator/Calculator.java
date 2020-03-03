package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private Display display;
    private double val;

    public double add(double a, double b){

        return val = a + b;
    }

    public double sub(double a, double b){
        return val = a - b;
    }

    public double mul(double a,double b){
        return val = a * b;
    }

    public double div(double a, double b){
        return val = a / b;
    }
}
