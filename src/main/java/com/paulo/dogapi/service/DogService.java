package com.paulo.dogapi.service;

import com.paulo.dogapi.model.Dog;
import com.paulo.dogapi.repository.DogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogService {
    private final DogRepository dogRepository;

    public DogService(DogRepository dogRepository){
        this.dogRepository = dogRepository;
    }

    public List<Dog> getDogDetails(){
        return dogRepository.getDogSource();
    }
}