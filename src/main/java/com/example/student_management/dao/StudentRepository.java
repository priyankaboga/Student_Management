package com.example.student_management.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student_management.entity.Student;
public interface StudentRepository extends JpaRepository<Student,Integer>{
	

}
