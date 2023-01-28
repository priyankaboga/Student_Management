package com.example.student_management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.student_management.entity.Student;
@Service
public interface StudentService {
	Student createStudent(Student s);
	Student getStudent(Integer rollNo);
	List<Student> getStudentList();
	Student updateStudent(Integer rollNo, Student s);
	String deleteStudent(Integer rollNo);
	

}
