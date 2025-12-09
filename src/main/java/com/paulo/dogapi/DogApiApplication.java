package com.paulo.dogapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DogApiApplication {

// http://localhost:8080/...
    public static void main(String[] args) {
        SpringApplication.run(DogApiApplication.class, args);
    }

}
