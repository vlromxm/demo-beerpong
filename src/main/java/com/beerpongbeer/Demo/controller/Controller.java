package com.beerpongbeer.Demo.controller;

import com.beerpongbeer.Demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    StudentRepository studentRepository;
    @GetMapping("/beer")
    public String text (){
        return "pong";
    }

}
