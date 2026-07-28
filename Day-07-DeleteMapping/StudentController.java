package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @DeleteMapping("/student")
    public String deleteStudent() {

        System.out.println("Student Deleted");

        return "Student Deleted Successfully";

    }

}
