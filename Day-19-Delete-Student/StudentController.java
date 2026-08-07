package com.example.demo.controller;

import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id){

        studentService.deleteStudent(id);

        return "Student Deleted Successfully";

    }

}
