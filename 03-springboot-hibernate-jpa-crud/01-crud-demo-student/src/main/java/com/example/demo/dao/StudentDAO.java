package com.example.demo.dao;

import com.example.demo.entity.Student;

public interface StudentDAO {

    void save(Student theStudent);
    Student findById(Integer id);

}
