package com.example.employeeManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeeManagement.entity.Employee;
import com.example.employeeManagement.service.EmployeeService;


@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@PostMapping("/addEmployees")
	public void addEmployeeDetails(@RequestBody Employee employee ) {
		employeeService.addEmployees(employee);
	}
	
	
	@GetMapping()
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/{employeeName}")
	public List<Employee> getEmployeesBYName(@PathVariable String  employeeName ){
		return employeeService.getEmployeesByemployeeName(employeeName);
	}
	
	@GetMapping("/search")
	public List<Employee> getEmployeesByDept(@RequestParam("employeeDept") String employeeDept){
		return employeeService.getEmployeesByEmployeeDeprtment(employeeDept);
	}

}
