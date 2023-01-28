package com.example.student_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student_management.dao.StudentRepository;
import com.example.student_management.entity.Student;

@Service
public class StudentServiceImp implements StudentService{
	@Autowired
	private StudentRepository studentRepo;

	@Override
	public Student createStudent(Student s) {
		// TODO Auto-generated method stub
		
		return studentRepo.save(s);
	}

	@Override
	public Student getStudent(Integer rollNo) {
		// TODO Auto-generated method stub
		Student s=studentRepo.findById(rollNo).orElse(null);
		return s;
	}

	@Override
	public List<Student> getStudentList() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public Student updateStudent(Integer rollNo, Student s) {
		// TODO Auto-generated method stub
		Student s1=studentRepo.findById(rollNo).orElse(null);
		if(s1!=null) {
			studentRepo.delete(s1);
		}
		return studentRepo.save(s);
	}

	@Override
	public String deleteStudent(Integer rollNo) {
		// TODO Auto-generated method stub
		Student s1=studentRepo.findById(rollNo).orElse(null);
		if(s1!=null) {
			studentRepo.delete(s1);
			return "Student got deleted successfully";
		}
		return "Unavailable Student";
	}
	

}
