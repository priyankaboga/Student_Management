package com.example.student_management.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	private String courseName;
	@Id
	private Integer courseId;
	private Integer courseDuration;
	private Integer noOfEnrollements;
	public Course(String courseName, Integer courseId, Integer courseDuration, Integer noOfEnrollements) {
		super();
		this.courseName = courseName;
		this.courseId = courseId;
		this.courseDuration = courseDuration;
		this.noOfEnrollements = noOfEnrollements;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public Integer getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(Integer courseDuration) {
		this.courseDuration = courseDuration;
	}
	public Integer getNoOfEnrollements() {
		return noOfEnrollements;
	}
	public void setNoOfEnrollements(Integer noOfEnrollements) {
		this.noOfEnrollements = noOfEnrollements;
	}
	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", courseId=" + courseId + ", courseDuration=" + courseDuration
				+ ", noOfEnrollements=" + noOfEnrollements + "]";
	}
	

}
