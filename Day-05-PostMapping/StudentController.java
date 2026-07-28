package com.example.demo.controller;

import com.example.demo.entity.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @PostMapping("/student")
    public String addStudent(@RequestBody Student student) {

        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getCity());

        return "Student Added Successfully";

    }

}
