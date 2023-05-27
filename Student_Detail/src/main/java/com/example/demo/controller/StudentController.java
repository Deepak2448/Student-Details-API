package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.module.Student;
import com.example.demo.service.StudentService;

import jakarta.servlet.http.HttpSession;

@Controller
public class StudentController {
	@Autowired
	StudentService ser;
	@RequestMapping("home")
	String home() {
		return "home.jsp";
	}
	
	@RequestMapping("addStudent")
	String addStudent(HttpSession h1,Student s) {
			System.out.println(s.getStudentMarks());
			System.out.println(s.getStudentName());
			ser.addStudent(s);
			h1.setAttribute("value", "Student Addded");
			return "home.jsp";
	}
	@RequestMapping("findStd")
	String Display(HttpSession h1,Integer studentId) {
		Student s=ser.findStd(studentId);
		if(s!=null) {
		h1.setAttribute("msg", s);}
		else {
			h1.setAttribute("msg","Student Not found");
		}
		return "find.jsp";
	}

}
