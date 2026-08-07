package com.example.demo.service;

import com.example.demo.dto.StudentDTO;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentDTO saveStudent(StudentDTO studentDTO){

        Student student = new Student();

        student.setName(studentDTO.getName());
        student.setCity(studentDTO.getCity());

        Student savedStudent = studentRepository.save(student);

        StudentDTO response = new StudentDTO();

        response.setId(savedStudent.getId());
        response.setName(savedStudent.getName());
        response.setCity(savedStudent.getCity());

        return response;
    }

}
