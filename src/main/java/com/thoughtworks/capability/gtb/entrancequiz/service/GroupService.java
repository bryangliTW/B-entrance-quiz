package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.model.Group;
import com.thoughtworks.capability.gtb.entrancequiz.model.Person;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class GroupService {
    private List<Person> persons = new ArrayList<>();
    private List<Person> shuffled;
    private List<Group> randomizedGroups = new ArrayList<>();

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
        shuffled = new ArrayList<>(persons);
    }

    public List<Person> getAll() {
        return persons;
    }

    public List<Group> randomizeAll() {
        List<Group> randomizingResult = new ArrayList<>();
        shuffled = new ArrayList<>(persons);
        Collections.shuffle(shuffled);

        int largerGroups = persons.size() % 6;

        int n = 0;
        for (int i = 0; i < 6; i++) {
            List<Person> newGroup = new ArrayList<>();
            int groupLimit = persons.size() / 6;
            if (i < largerGroups) {
                groupLimit = groupLimit + 1;
            }
            while (newGroup.size() < groupLimit) {
                newGroup.add(shuffled.get(n++));
            }
            randomizingResult.add(new Group(i, newGroup));
        }
        return randomizingResult;
    }

    public void savePerson(String name) {
        Person newPerson = new Person(persons.size() + 1, name);
        this.persons.add(newPerson);
    }
}
