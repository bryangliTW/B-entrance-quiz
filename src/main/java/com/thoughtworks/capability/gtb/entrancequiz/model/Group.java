package com.thoughtworks.capability.gtb.entrancequiz.model;

import java.util.List;

public class Group {
    private Integer id;
    private List<Person> group;

    public Group(Integer id, List<Person> group) {
        this.id = id;
        this.group = group;
    }

    public Integer getId() {
        return id;
    }

    public List<Person> getGroup() {
        return group;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setGroup(List<Person> group) {
        this.group = group;
    }
}
