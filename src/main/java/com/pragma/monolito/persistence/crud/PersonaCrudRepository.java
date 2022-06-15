package com.pragma.monolito.persistence.crud;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.pragma.monolito.persistence.entity.PersonaEntity;

public interface PersonaCrudRepository extends CrudRepository<PersonaEntity,Integer> {

    Optional<PersonaEntity> findByIdPersona(String idPersona);
    
}
