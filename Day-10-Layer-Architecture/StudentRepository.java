package com.example.demo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    public String getStudent() {

        return "Student Data From Repository";

    }

}
