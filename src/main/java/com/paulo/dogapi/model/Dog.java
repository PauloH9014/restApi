package com.paulo.dogapi.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
// creation class
public class Dog {

    @Id     // generation of primary keys
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // generation of values indentity
    private long Id;     //create variavel id

    private String name;  //create variavel name
    private int age;  //create variavel age

}
