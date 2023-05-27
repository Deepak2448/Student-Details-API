package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.module.Student;
import com.example.demo.repo.StudentRepo;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
	StudentRepo repo;
	@Override
	public Student addStudent(Student s) {
		return repo.save(s);
	}
	@Override
	public Student findStd(Integer studentId) {
		// TODO Auto-generated method stub
		return repo.findById(studentId).orElse(null);
	}

}
