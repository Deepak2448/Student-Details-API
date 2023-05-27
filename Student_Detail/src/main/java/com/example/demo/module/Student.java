package com.example.demo.module;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	private String studentName;
	private double studentMarks;

	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getStudentMarks() {
		return studentMarks;
	}
	public void setStudentMarks(double studentMarks) {
		this.studentMarks = studentMarks;
	}
	@Override
	public String toString() {
		return "Student [ studentId= " + studentId + ", studentName= " + studentName + ", studentMarks=" + studentMarks+ " ]";
	}
	


}
