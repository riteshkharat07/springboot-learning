package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable int id,
                                 @RequestBody Student student){

        return studentService.updateStudent(id, student);

    }

}
