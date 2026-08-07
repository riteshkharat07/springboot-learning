package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getByName(String name){
        return studentRepository.findByName(name);
    }

    public List<Student> getByCity(String city){
        return studentRepository.findByCity(city);
    }

    public List<Student> getByNameAndCity(String name, String city){
        return studentRepository.findByNameAndCity(name, city);
    }

}
