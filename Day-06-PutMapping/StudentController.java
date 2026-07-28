package com.example.demo.controller;

import com.example.demo.entity.Student;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @PutMapping("/student")
    public String updateStudent(@RequestBody Student student) {

        System.out.println("Student Updated");

        System.out.println("ID : " + student.getId());
        System.out.println("Name : " + student.getName());
        System.out.println("City : " + student.getCity());

        return "Student Updated Successfully";

    }

}
