package com.pragma.monolito.persistence.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.pragma.monolito.domain.Person;
import com.pragma.monolito.persistence.entity.PersonaEntity;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mappings({
        @Mapping(source = "idPersona",target = "personId"),
        @Mapping(source = "nombres",target = "names"),
        @Mapping(source = "apellidos",target = "lastName"),
        @Mapping(source = "tipoDocumento",target = "documenttype"),
        @Mapping(source = "edad",target = "age"),
        @Mapping(source = "ciudadNacimiento",target = "city"),
    })
    Person toPerson(PersonaEntity personaEntity);
    List<Person> toPersons(List<PersonaEntity> personaEntity);

    @InheritInverseConfiguration
    PersonaEntity toPersonaEntity(Person person);

    
}
