package com.softhousesolutions.springgraphql.resolver;

import com.softhousesolutions.springgraphql.input.PersonInput;
import com.softhousesolutions.springgraphql.model.Person;
import com.softhousesolutions.springgraphql.repository.PersonRepository;
import graphql.GraphQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class PersonResolver{

    private GraphQL graphQL;

    @Autowired
    private PersonRepository repository;

    public Collection<Person> findAllPeople() {
        return repository.findAll();
    }

    public Person savePerson(PersonInput input){
        return repository.save(new Person(input.getName(), input.getAge(), input.getGender()));
    }
}
