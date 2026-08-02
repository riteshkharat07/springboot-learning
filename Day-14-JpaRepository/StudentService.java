package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // Save Student
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    // Get All Students
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    // Get Student By Id
    public Optional<Student> getStudentById(int id){
        return studentRepository.findById(id);
    }

    // Delete Student
    public void deleteStudent(int id){
        studentRepository.deleteById(id);
    }

    // Check Student Exists
    public boolean isStudentExists(int id){
        return studentRepository.existsById(id);
    }

    // Count Students
    public long totalStudents(){
        return studentRepository.count();
    }

}
