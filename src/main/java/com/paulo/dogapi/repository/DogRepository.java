package com.paulo.dogapi.repository;

import com.paulo.dogapi.model.Dog;
import org.springframework.data.repository.CrudRepository;

//already gives:
//save()
//findById()
//findAll()
//deleteById()

// for basic operations.
public interface DogRepository extends CrudRepository<Dog, Long> {
    Dog findById(long Id);
    Dog findByName(String name);
    Dog findByAge(int age);
}

