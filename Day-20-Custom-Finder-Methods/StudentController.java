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

    @GetMapping("/name/{name}")
    public List<Student> getByName(@PathVariable String name){
        return studentService.getByName(name);
    }

    @GetMapping("/city/{city}")
    public List<Student> getByCity(@PathVariable String city){
        return studentService.getByCity(city);
    }

    @GetMapping("/{name}/{city}")
    public List<Student> getByNameAndCity(@PathVariable String name,
                                          @PathVariable String city){
        return studentService.getByNameAndCity(name, city);
    }

}
