package com.example.studentManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentManagement.entity.Student;
import com.example.studentManagement.service.StudentService;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping()
	public void createStudent(@RequestBody Student student) {
		studentService.addStudentDetails(student);
	}
	
	@GetMapping()
	public List<Student>  getAllStudent(){
		return studentService.getAllStudents();
	}
	
	
	@GetMapping("/{studentId}")
	public Object getStudentDetails(@PathVariable String studentId) {
		return studentService.getStudentById(studentId);
		
	}
	
	@DeleteMapping("/{studentId}")
	public Object deleteStudentByStudentId(@PathVariable String studentId) {
		studentService.deleteStudentByStudentId(studentId);
		return "Deleted Successfully";
	}

}
