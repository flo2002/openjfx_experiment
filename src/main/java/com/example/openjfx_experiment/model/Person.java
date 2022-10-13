package com.example.openjfx_experiment.model;


import javax.persistence.Entity;

@Entity
public class Person {
    private String firstName;

    public Person() {
    }

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
