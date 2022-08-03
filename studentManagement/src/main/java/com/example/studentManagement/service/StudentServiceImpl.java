package com.example.studentManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentManagement.entity.Student;
import com.example.studentManagement.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	
	@Autowired
	StudentRepository studentRepository;
	@Override
	public void addStudentDetails(Student student) {
		studentRepository.save(student);
	}
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		List<Student> students = studentRepository.findAll();
		return students;
	}
	@Override
	public Student getStudentById(String studentId) {
		// TODO Auto-generated method stub
		Optional<Student> studentOptional = studentRepository.findById(studentId);
		if(studentOptional.isPresent()) {
			Student student = studentOptional.get();
			return student;
		}else {
			throw new RuntimeException();
		}
		
	}
	@Override
	public void deleteStudentByStudentId(String studentId) {
		// TODO Auto-generated method stub
		Student studentDetails = getStudentById(studentId);
		studentRepository.delete(studentDetails);
		
	}
	
	
	
}
