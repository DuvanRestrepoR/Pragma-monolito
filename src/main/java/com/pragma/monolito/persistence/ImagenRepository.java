package com.pragma.monolito.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pragma.monolito.domain.Image;
import com.pragma.monolito.domain.repository.ImageRepository;
import com.pragma.monolito.persistence.crud.ImagenCrudRepository;
import com.pragma.monolito.persistence.entity.ImagenEntity;
import com.pragma.monolito.persistence.mapper.ImagenMapper;

@Repository
public class ImagenRepository implements ImageRepository {

    @Autowired
    private ImagenCrudRepository imagenCrudRepository;

    @Autowired
    private ImagenMapper mapper;


    @Override
    public List<Image> getAll() {
        List<ImagenEntity> imagen = (List<ImagenEntity>) imagenCrudRepository.findAll();
        return mapper.toImages(imagen);
    }

    @Override
    public Optional<Image> getByPersonId(String personId) { 
        return imagenCrudRepository.findByIdPersona(personId).map(imagenEntity-> mapper.toImage(imagenEntity) );
    }
    
}
