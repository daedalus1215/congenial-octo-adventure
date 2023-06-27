package com.example.demo.cat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import javax.annotation.processing.Generated;

@Entity
public class Cat {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {

    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
