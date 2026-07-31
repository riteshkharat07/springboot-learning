package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public String getStudent(@RequestParam int id) {

        return "Student ID : " + id;

    }

    @GetMapping("/student/details")
    public String getStudentDetails(@RequestParam int id,
                                    @RequestParam String name) {

        return "Student ID : " + id +
                ", Name : " + name;

    }

}
