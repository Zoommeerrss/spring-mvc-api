package com.javatpoint.domain.service;

import com.javatpoint.domain.entity.PersonDTO;
import com.javatpoint.presentation.api.request.PersonRequest;

import java.util.List;

public interface PersonService {

    public PersonDTO save(PersonRequest entity);
    public List<PersonDTO> findAll();
    public long count();
}
