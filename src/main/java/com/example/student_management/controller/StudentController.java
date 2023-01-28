package com.example.student_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student_management.entity.Student;
import com.example.student_management.service.StudentService;

@RestController
@RequestMapping("Student_Management")
public class StudentController {
	@Autowired
	private StudentService studentServices;
	
	@GetMapping("students")
	public List<Student> getAllStudents(){
		return studentServices.getStudentList();
	}
	
	@GetMapping("students/{rollNo}")
	public Student getoneStudent(@PathVariable Integer rollNo) {
		return studentServices.getStudent(rollNo);
	}
	
	@PostMapping("students")
	public Student addStudent(@RequestBody Student s) {
		return studentServices.createStudent(s);
		
	}
	
	@PutMapping("students/{rollNo}")
	public Student updateStudent(@PathVariable Integer rollNo,@RequestBody Student s) {
		return studentServices.updateStudent(rollNo, s);
	}
	
	@DeleteMapping("students/{rollNo}")
	public String deleteStudent(@PathVariable Integer rollNo) {
		return studentServices.deleteStudent(rollNo);
	}

}
