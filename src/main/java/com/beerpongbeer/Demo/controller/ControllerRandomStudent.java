package com.beerpongbeer.Demo.controller;

import com.beerpongbeer.Demo.entity.Student;
import com.beerpongbeer.Demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class ControllerRandomStudent {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/create-random-student")
    public Student randomStudent() {
        String[] names = {"Vladyslav", "Rostyslav", "Vitalii", "Tatiana", "Lyudmila"};
        String[] emails = {"student1@gmail.com", "student3@mail.ru", "student2@gmail.com", "userstudent@bigmir.net", "stuuser@gmail.com"};
        Random randomstudents = new Random();
        int randomName = randomstudents.nextInt(names.length);
        int randomEmail = randomstudents.nextInt(emails.length);
        String name = names[randomName];
        String email = emails[randomEmail];
        Student student = new Student();
        student.setName(name);
        student.setEmail(email);
        return studentRepository.save(student);
    }
}
