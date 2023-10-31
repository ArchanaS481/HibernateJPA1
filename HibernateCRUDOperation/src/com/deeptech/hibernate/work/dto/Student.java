package com.deeptech.hibernate.work.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stu")
public class Student {
     
	@Id
	@Column(name="S_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	@Column(name="S_StudentName")
	private String StudentName;
	@Column(name="S_RegNum")
	private int RegNum;
	@Column(name="S_Course")
	private String Course;     //class entities
	
	//generate getter and setter method
	
	public int getRegNum() {
		return RegNum;
	}
	public void setRegNum(int regNum) {
		RegNum = regNum;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	
	
}
