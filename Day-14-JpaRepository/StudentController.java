package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Save Student
    @PostMapping
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    // Get All Students
    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    // Get Student By Id
    @GetMapping("/{id}")
    public Optional<Student> getStudentById(@PathVariable int id){
        return studentService.getStudentById(id);
    }

    // Delete Student
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
        return "Student Deleted Successfully";
    }

    // Count Students
    @GetMapping("/count")
    public long countStudents(){
        return studentService.totalStudents();
    }

    // Check Student Exists
    @GetMapping("/exists/{id}")
    public boolean exists(@PathVariable int id){
        return studentService.isStudentExists(id);
    }

}
