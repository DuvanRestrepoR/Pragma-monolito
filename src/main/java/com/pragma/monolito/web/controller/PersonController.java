package com.pragma.monolito.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pragma.monolito.domain.Person;
import com.pragma.monolito.domain.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/all")
    public List<Person> getAll() {
        System.out.println("Hola");
        return personService.getAll();
    }

    @GetMapping(path = "/getone/{PersonId}")
    public Optional<Person> getByPersonId(@PathVariable ("PersonId") String PersonId) { 
        return personService.getByPersonId(PersonId);
    }

    @GetMapping("/hola")
    public String getStri() { 
        return "Hola";
    }
    
}
