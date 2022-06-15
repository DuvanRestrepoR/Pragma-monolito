package com.pragma.monolito.domain.repository;

import java.util.List;
import java.util.Optional;

import com.pragma.monolito.domain.Image;

public interface ImageRepository {

    List<Image> getAll();
    Optional<Image> getByPersonId(String personId);
    
}
