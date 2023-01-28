package com.example.student_management.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.student_management.entity.Course;
@Transactional
public interface CourseRepository extends JpaRepository<Course,Integer>{
	
	@Modifying
	@Query(value = "update Course c set c.noOfEnrollements = c.noOfEnrollements + 1 where c.courseId = ?1",nativeQuery = true)
	void increaseCount(Integer courseId);

}
