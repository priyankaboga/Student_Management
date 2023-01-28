package com.example.student_management.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student_management.entity.Enrollments;

public interface EnrollmentRepository extends JpaRepository<Enrollments,Integer>{
	//@Query(select e.rollNo from )
	//List<Integer> getAllStudent(Integer courseId);
	
}
