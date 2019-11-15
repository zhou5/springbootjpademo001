package com.offcn.controller;

import com.offcn.dao.PersonRepository;
import com.offcn.po.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person3")
public class Person3Controller {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("getPerson/{name}")
    public Person getPerson(@PathVariable String name){
        return personRepository.findPerson(name);
    }
}
