package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.model.Person;

import java.util.List;

public class GroupService {
    private List<Person> persons;

    public GroupService() {
        this.persons.add(new Person(1, "成吉思汗"));
        this.persons.add(new Person(2, "鲁班七号"));
        this.persons.add(new Person(3, "太乙真人"));
        this.persons.add(new Person(4, "钟无艳"));
        this.persons.add(new Person(5, "花木兰"));
        this.persons.add(new Person(6, "雅典娜"));
        this.persons.add(new Person(7, "芈月"));
        this.persons.add(new Person(8, "白起"));
        this.persons.add(new Person(9, "刘禅"));
        this.persons.add(new Person(10, "庄周"));
        this.persons.add(new Person(11, "马超"));
        this.persons.add(new Person(12, "刘备"));
        this.persons.add(new Person(13, "哪吒"));
        this.persons.add(new Person(14, "大乔"));
        this.persons.add(new Person(15, "蔡文姬"));
    }
    
}
