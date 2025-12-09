package com.paulo.dogapi.controller;

import com.paulo.dogapi.model.Dog;
import com.paulo.dogapi.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/inf")
public class DogController {

    @Autowired
    private DogService dogService;

    @RequestMapping("/dog")     // Solicitação de mapeamento
    public String createDog(long ID, String name, int age){
        Dog varDogs=dogService.create(ID,name,age);

        return "ID: "+varDogs.getId()+"Name: "+varDogs.getName()+"Age: "+varDogs.getAge(); // retorna gets das variaveis
    }
}
