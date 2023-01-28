package com.example.student_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student_management.dao.CourseRepository;
import com.example.student_management.entity.Course;
@Service
public class CourseServiceImp implements CourseService{
	@Autowired
	public CourseRepository courseRepo;

	@Override
	public Course createCourse(Course c) {
		// TODO Auto-generated method stub
		
		return courseRepo.save(c);
	}

	@Override
	public Course getCourse(Integer courseId) {
		// TODO Auto-generated method stub
		Course c=courseRepo.findById(courseId).orElse(null);
		return c;
	}

	@Override
	public List<Course> getCourseList() {
		// TODO Auto-generated method stub
		
		return courseRepo.findAll();
	}

	@Override
	public Course updateCourse(Integer courseId, Course c) {
		// TODO Auto-generated method stub
		Course c1=courseRepo.findById(courseId).orElse(null);
		if(c1!=null) {
			courseRepo.delete(c1);
		}
		return courseRepo.save(c);
	
	}

	@Override
	public String deleteCourse(Integer courseId) {
		// TODO Auto-generated method stub
		Course c1=courseRepo.findById(courseId).orElse(null);
		if(c1!=null) {
			courseRepo.delete(c1);
			return "Course got deleted successfully";
		}
		return "Unavailable Course";
	}
	}
	


