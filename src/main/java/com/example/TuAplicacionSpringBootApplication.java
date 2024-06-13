package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.compras", "com.example.repositorios"})
public class TuAplicacionSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(TuAplicacionSpringBootApplication.class, args);
    }
}
