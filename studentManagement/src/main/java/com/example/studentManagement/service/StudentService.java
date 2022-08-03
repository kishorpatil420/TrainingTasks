package com.example.studentManagement.service;

import java.util.List;

import com.example.studentManagement.entity.Student;

public interface StudentService {

	void addStudentDetails(Student student);

	List<Student> getAllStudents();

	Object getStudentById(String studentId);

	void deleteStudentByStudentId(String studentId);

}
