package com.pragma.monolito.domain.repository;

import java.util.List;
import java.util.Optional;

import com.pragma.monolito.domain.Person;

public interface PersonRepository {

    List<Person> getAll();
    Optional<Person> getByPersonId(String personId);
    
}
