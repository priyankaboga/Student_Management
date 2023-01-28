package com.example.student_management.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	private String name;
	@Id
	private Integer rollNo;
	private Integer courseCount;
	private Integer courseCompleted;
	public Student(String name, Integer rollNo, Integer courseCount, Integer courseCompleted) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.courseCount = courseCount;
		this.courseCompleted = courseCompleted;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRollNo() {
		return rollNo;
	}
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	public Integer getCourseCount() {
		return courseCount;
	}
	public void setCourseCount(Integer courseCount) {
		this.courseCount = courseCount;
	}
	public Integer getCourseCompleted() {
		return courseCompleted;
	}
	public void setCourseCompleted(Integer courseCompleted) {
		this.courseCompleted = courseCompleted;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", courseCount=" + courseCount + ", courseCompleted="
				+ courseCompleted + "]";
	}
	
	

}
