package com.example.prac10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanClass {

    @Bean
    public Programmer num1() {
        return new Junior();
    }

    @Bean
    public Programmer num2() {
        return new Middle();
    }

    @Bean
    public Programmer num3() {
        return new Senior();
    }
}
