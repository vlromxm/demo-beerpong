package com.beerpongbeer.Demo.controller;

import com.beerpongbeer.Demo.entity.Student;
import com.beerpongbeer.Demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ControllerFindAllStudents {
    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> allStudents() {
        return studentRepository.findAll();
    }
}
