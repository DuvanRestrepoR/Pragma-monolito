package com.pragma.monolito.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pragma.monolito.domain.Image;
import com.pragma.monolito.domain.repository.ImageRepository;

@Service
public class ImageService {

    @Autowired
    private ImageRepository imageRepository;

    public List<Image> getAll() {
        return imageRepository.getAll();
    }

    public Optional<Image> getByPersonId(String personId) { 
        return imageRepository.getByPersonId(personId);
    }
    
}
