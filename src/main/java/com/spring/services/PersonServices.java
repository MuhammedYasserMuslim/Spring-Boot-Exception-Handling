package com.spring.services;

import com.spring.error.RecordNotFoundException;
import com.spring.model.Person;
import com.spring.repository.PersonRepository;
import com.spring.services.base.BaseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServices implements BaseServices<Person, Long> {

    @Autowired
    PersonRepository personRepository;

    @Override
    public Long count() {
        return personRepository.count();
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public Optional<Person> findById(Long id) {
        Optional<Person> entity = personRepository.findById(id);

        if (entity.isPresent()) {
            return entity;
        }
        else throw new RecordNotFoundException("id " +id +" Not Found Enter Present id");
    }
    @Override
    public void insert(Person person) {
        personRepository.save(person);
    }

    @Override
    public void update(Person person) {
        personRepository.save(person);
    }

    @Override
    public void deleteById(Long id) {
        personRepository.deleteById(id);
    }
}
