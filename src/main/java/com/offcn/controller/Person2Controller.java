package com.offcn.controller;

import com.offcn.dao.PersonRepository;
import com.offcn.po.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person2")
public class Person2Controller {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("findByNameIs/{name}")
    public Person findByNameIs(@PathVariable String name){
        return personRepository.findByNameIs(name);
    }

}
