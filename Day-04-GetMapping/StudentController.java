package com.example.demo.controller;

import com.example.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public String student() {

        return "Welcome Student";

    }

    @GetMapping("/student/info")
    public Student studentInfo() {

        return new Student(101, "Ritesh", "Nashik");

    }

}
