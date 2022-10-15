package com.example.openjfx_experiment.persistence;

import com.example.openjfx_experiment.model.Person;
import com.example.openjfx_experiment.subsystems.PersonBroker;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class DatabaseFacade {
    private EntityManager entityManager;

    public DatabaseFacade() {
        EntityManagerFactory fact = Persistence.createEntityManagerFactory("persons");
        this.entityManager = fact.createEntityManager();
    }

    public List<Person> getAllPersons() {
        PersonBroker broker = new PersonBroker(entityManager);
        return broker.getAll();
    }

    public void addPerson(Person person) {
        PersonBroker broker = new PersonBroker(entityManager);
        broker.add(person);
    }

    public void updatePerson(Person person) {
        PersonBroker broker = new PersonBroker(entityManager);
        broker.update(person);
    }

    public void deletePerson(Person person) {
        PersonBroker broker = new PersonBroker(entityManager);
        broker.delete(person);
    }
}