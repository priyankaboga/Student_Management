package com.example.student_management.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Enrollments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer enrollmentId;
	private Integer courseId;
	private Integer rollNo;
	private Boolean isDone;
	public Enrollments() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Enrollments( Integer courseId, Integer rollNo) {
		super();
		
		this.courseId = courseId;
		this.rollNo = rollNo;
		this.isDone = false;
	}
	public Integer getEnrollmentId() {
		return enrollmentId;
	}
	public void setEnrollmentId(Integer enrollmentId) {
		this.enrollmentId = enrollmentId;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public Integer getRollNo() {
		return rollNo;
	}
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	public Boolean getIsDone() {
		return isDone;
	}
	
	public void completeCourse() {
		isDone = true;
	}
	@Override
	public String toString() {
		return "Enrollments [enrollmentId=" + enrollmentId + ", courseId=" + courseId + ", rollNo=" + rollNo
				+ ", isDone=" + isDone + "]";
	}
	
}
