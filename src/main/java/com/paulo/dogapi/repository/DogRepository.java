package com.paulo.dogapi.repository;

import com.paulo.dogapi.model.Dog;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class DogRepository {

    public List<Dog> getDogSource(){
        System.out.println("Repository: Fetching dog data from a simulated database...");

        return Arrays.asList(
                new Dog("1","Pastor alemao"),
                new Dog("2", "Labrador"),
                new Dog("3","Pitbull")
        );
    }
}
