package com.kodilla.spring.shape;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShapeFactory {

    @Bean
    public Squere createSquere() {
        return new Squere();
    }
}
