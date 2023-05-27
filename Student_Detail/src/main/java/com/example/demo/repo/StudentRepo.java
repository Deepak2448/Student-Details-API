package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.module.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
