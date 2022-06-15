package com.pragma.monolito.persistence.crud;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.pragma.monolito.persistence.entity.ImagenEntity;

public interface ImagenCrudRepository extends CrudRepository<ImagenEntity,Integer> {
    
    Optional<ImagenEntity> findByIdPersona(String idPersona);

}
