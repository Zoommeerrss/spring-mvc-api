package com.javatpoint.domain.service.impl;

import com.javatpoint.adapter.entity.Person;
import com.javatpoint.adapter.repository.PersonRepository;
import com.javatpoint.domain.converter.PersonConverter;
import com.javatpoint.domain.entity.PersonDTO;
import com.javatpoint.domain.service.PersonService;
import com.javatpoint.presentation.api.request.PersonRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository repository;

    @Override
    public PersonDTO save(PersonRequest entity) {
        PersonDTO dto = PersonConverter.fromRequest(entity);
        Person p = repository.save(PersonConverter.toEntity(dto));
        return PersonConverter.toDTO(p);
    }

    @Override
    public List<PersonDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(PersonConverter::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public long count() {
        return repository.count();
    }
}
