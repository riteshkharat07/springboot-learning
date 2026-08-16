package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/sort")
    public List<Student> getStudentsSorted(
            @RequestParam String field,
            @RequestParam String direction) {

        return studentService.getStudentsSorted(field, direction);
    }
}
