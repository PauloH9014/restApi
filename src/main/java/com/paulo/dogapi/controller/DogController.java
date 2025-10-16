package com.paulo.dogapi.controller;

import com.paulo.dogapi.model.Dog;
import com.paulo.dogapi.service.DogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogController {
    private final DogService dogService;

    public DogController(DogService dogService){
        this.dogService = dogService;
    }

    @GetMapping("/api/v1/dogs")
    public List<Dog> getDogs(){
        return dogService.getDogDetails();
    }
}
