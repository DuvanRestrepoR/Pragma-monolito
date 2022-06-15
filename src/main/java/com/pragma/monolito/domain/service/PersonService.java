package com.pragma.monolito.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pragma.monolito.domain.Person;
import com.pragma.monolito.domain.repository.PersonRepository;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public List<Person> getAll() {
        return personRepository.getAll();
    }

    public Optional<Person> getByPersonId(String personId) { 
        return personRepository.getByPersonId(personId);
    }
    
}
