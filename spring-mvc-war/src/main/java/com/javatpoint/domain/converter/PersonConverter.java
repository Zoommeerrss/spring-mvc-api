package com.javatpoint.domain.converter;

import com.javatpoint.adapter.entity.Person;
import com.javatpoint.domain.entity.PersonDTO;
import com.javatpoint.presentation.api.request.PersonRequest;
import com.javatpoint.presentation.api.response.PersonResponse;

public class PersonConverter {

    public static Person toEntity(PersonDTO entity) {
        return Person.builder()
                .personId(entity.getPersonId())
                .name(entity.getName())
                .age(entity.getAge())
                .year(entity.getYear())
                .build();
    }

    public static PersonDTO toDTO(Person entity) {
        return PersonDTO.builder()
                .personId(entity.getPersonId())
                .name(entity.getName())
                .age(entity.getAge())
                .year(entity.getYear())
                .build();
    }

    public static PersonResponse toResponse(PersonDTO entity) {
        return PersonResponse.builder()
                .personId(entity.getPersonId())
                .name(entity.getName())
                .age(entity.getAge())
                .year(entity.getYear())
                .build();
    }

    public static PersonDTO fromRequest(PersonRequest entity) {
        return PersonDTO.builder()
                .name(entity.getName())
                .age(entity.getAge())
                .year(entity.getYear())
                .build();
    }
}
