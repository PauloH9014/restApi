package com.paulo.productapi;

import com.paulo.userapi.UserApiApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Product {

    public static void main(String[] args) {
        SpringApplication.run(UserApiApplication.class, args);
    }
}
