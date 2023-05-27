package com.example.demo.service;

import com.example.demo.module.Student;

public interface StudentService  {

	Student addStudent(Student s);
	
	Student findStd(Integer studentId);
}
