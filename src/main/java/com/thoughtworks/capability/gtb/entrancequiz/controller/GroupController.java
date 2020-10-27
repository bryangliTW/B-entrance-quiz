package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.model.Group;
import com.thoughtworks.capability.gtb.entrancequiz.model.Person;
import com.thoughtworks.capability.gtb.entrancequiz.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class GroupController {

    @Autowired
    private GroupService groupService;

    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @GetMapping("/members")
    public List<Person> GetAllMembers() {
        return groupService.getAll();
    }

    @GetMapping("/randomizing")
    public List<Group> randomizeAll() {
        return groupService.randomizeAll();
    }

    @PostMapping(path = "/add-member")
    public void addMember(@RequestBody String name) {
        groupService.savePerson(name);
    }
}
