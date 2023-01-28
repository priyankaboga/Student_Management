package com.example.student_management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.student_management.dao.CourseRepository;
import com.example.student_management.entity.Course;
import com.example.student_management.entity.Student;
@Service
public interface CourseService {
	Course createCourse(Course c);
	Course getCourse(Integer courseId);
	List<Course> getCourseList();
	Course updateCourse(Integer courseId, Course c);
	String deleteCourse(Integer courseId);
	void increaseCourseCount(Integer courseId);
	void decreaseCourseCount(Integer courseId);
}
