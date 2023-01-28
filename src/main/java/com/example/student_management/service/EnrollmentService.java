package com.example.student_management.service;

import org.springframework.stereotype.Service;

import com.example.student_management.entity.Enrollments;

@Service
public interface EnrollmentService {
	String enrollCourse(Enrollments e);
	String cancelCourse(Integer courseId, Integer rollNo);
	String certifyCourse(Integer courseId, Integer rollNo);
}
