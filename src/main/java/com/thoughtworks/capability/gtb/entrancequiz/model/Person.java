package com.thoughtworks.capability.gtb.entrancequiz.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
    @Autowired
    private Integer id;
    private String name;

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
