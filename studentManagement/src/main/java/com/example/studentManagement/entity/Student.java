package com.example.studentManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="STUDENT_DETAILS")
public class Student {
	
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name="system-uuid",strategy = "uuid")
	@Column(name="STUDENT_ID")
	private String studentId;
	
	@Column(name="STUDENT_NAME")
	private String studentName;
	
	
	@Column(name="STUDENT_CLASS")
	private String studentClass;
	
	@Column(name="STUDENT_ROLL")
	private String studentRoll;
	
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public String getStudentRoll() {
		return studentRoll;
	}

	public void setStudentRoll(String studentRoll) {
		this.studentRoll = studentRoll;
	}


	
}
