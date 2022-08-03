package com.example.employeeManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeeManagement.entity.Employee;
import com.example.employeeManagement.repository.EmployeeRepository;



@Service
public class EmployeeServiceImpl implements EmployeeService{

	
	@Autowired
	EmployeeRepository employeeRepository;
	@Override
	public void addEmployees(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
		
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		
		List<Employee> employees = employeeRepository.findAll();
		return employees;
	}


	@Override
	public List<Employee> getEmployeesByemployeeName(String employeeName) {
		// TODO Auto-generated method stub
		List<Employee> employees = employeeRepository.findEmployeesByemployeeName(employeeName);
		return employees;
	}

	@Override
	public List<Employee> getEmployeesByEmployeeDeprtment(String employeeDept) {
		// TODO Auto-generated method stub
		List<Employee> employees = employeeRepository.findEmployeesByEmployeeDepartment(employeeDept);
		return employees;
	}


}
