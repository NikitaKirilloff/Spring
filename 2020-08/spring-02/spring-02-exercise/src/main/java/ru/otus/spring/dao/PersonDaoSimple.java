package ru.otus.spring.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.otus.spring.domain.Person;


@Repository("personDao")
public class PersonDaoSimple implements PersonDao {

    public Person findByName(String name) {
        return new Person(name, 18);
    }
}
