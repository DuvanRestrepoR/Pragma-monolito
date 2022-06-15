package com.pragma.monolito.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pragma.monolito.domain.Person;
import com.pragma.monolito.domain.repository.PersonRepository;
import com.pragma.monolito.persistence.crud.PersonaCrudRepository;
import com.pragma.monolito.persistence.entity.PersonaEntity;
import com.pragma.monolito.persistence.mapper.PersonMapper;

@Repository
public class PersonaRepository  implements PersonRepository {

    @Autowired(required = true)
    private PersonaCrudRepository personaCrudRepository;
    @Autowired(required = true)
    private PersonMapper mapper;

    @Override
    public List<Person> getAll() {
        List<PersonaEntity> personas = (List<PersonaEntity>) personaCrudRepository.findAll();
        return mapper.toPersons(personas);
    }

    @Override
    public Optional<Person> getByPersonId(String personId) { 
        return personaCrudRepository.findByIdPersona(personId).map(personaEntity-> mapper.toPerson(personaEntity) );
    }
    
}
