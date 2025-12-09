package com.paulo.dogapi.service;

import com.paulo.dogapi.model.Dog;
import com.paulo.dogapi.repository.DogRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class DogService {
    @Autowired
    private DogRepository dogRepository;

    public Dog create(@RequestParam long ID,@RequestParam String name,@RequestParam int age){
        Dog varDog = new Dog();
        varDog.setId(ID);
        varDog.setName(name);
        varDog.setAge(age);

        return dogRepository.save(varDog);
    }
}