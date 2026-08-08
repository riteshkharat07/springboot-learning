package com.example.demo.service;

import com.example.demo.dto.StudentDTO;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private ModelMapper modelMapper;

    public StudentDTO saveStudent(StudentDTO studentDTO) {

        // DTO → Entity
        Student student = modelMapper.map(studentDTO, Student.class);

        Student savedStudent = studentRepository.save(student);

        // Entity → DTO
        return modelMapper.map(savedStudent, StudentDTO.class);
    }
}
