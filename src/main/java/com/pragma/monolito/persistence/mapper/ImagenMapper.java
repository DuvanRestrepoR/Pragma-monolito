package com.pragma.monolito.persistence.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.pragma.monolito.domain.Image;
import com.pragma.monolito.persistence.entity.ImagenEntity;

@Mapper(componentModel = "spring")
public interface ImagenMapper {

    @Mappings({
        @Mapping(source = "idImagen",target = "imageId"),
        @Mapping(source = "idPersona",target = "personId"),
        @Mapping(source = "imagen",target = "image"),
    })
    Image toImage(ImagenEntity imagenEntity);
    @IterableMapping(elementTargetType = Image.class)
    List<Image> toImages(List<ImagenEntity> imagenEntity);

    @InheritInverseConfiguration
    ImagenEntity toImagenEntity(Image image);
}
