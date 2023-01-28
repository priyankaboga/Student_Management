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

import com.example.student_management.entity.Course;
import com.example.student_management.service.CourseService;
@RequestMapping("Student_Management")
@RestController
public class CourseController {
	@Autowired
	public CourseService courseServices;
	@GetMapping("courses")
	public List<Course> getAllCourses(){
		return courseServices.getCourseList();
	}
	
	@GetMapping("courses/{courseId}")
	public Course getoneCourse(@PathVariable Integer courseId) {
		return courseServices.getCourse(courseId);
	}
	
	@PostMapping("courses")
	public Course addCourse(@RequestBody Course c) {
		return courseServices.createCourse(c);
		
	}
	
	@PutMapping("courses/{courseId}")
	public Course updateCourse(@PathVariable Integer courseId,@RequestBody Course c) {
		return courseServices.updateCourse(courseId, c);
	}
	
	@DeleteMapping("courses/{courseId}")
	public String deleteCourse(@PathVariable Integer courseId) {
		return courseServices.deleteCourse(courseId);
	}


}
