package com.example.student_management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student_management.dao.CourseRepository;
import com.example.student_management.dao.EnrollmentRepository;
import com.example.student_management.dao.StudentRepository;
import com.example.student_management.entity.Enrollments;

@Service
public class EnrollmentServiceImp implements EnrollmentService{
	
	@Autowired
	private EnrollmentRepository enrollRepo;
	
	@Autowired
	private StudentRepository studRepo;
	
	@Autowired 
	private CourseRepository courseRepo;
	
	@Override
	public String enrollCourse(Enrollments e) {
		enrollRepo.save(e);
		return "Successfully Enrolled";
	}

	@Override
	public String cancelCourse(Integer courseId, Integer rollNo) {
		
		return null;
	}

	@Override
	public String certifyCourse(Integer courseId, Integer rollNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
