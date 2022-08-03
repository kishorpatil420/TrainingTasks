package com.example.employeeManagement.service;

import java.util.List;

import com.example.employeeManagement.entity.Employee;

public interface EmployeeService {

	void addEmployees(Employee employee);

	List<Employee> getAllEmployees();

	List<Employee> getEmployeesByemployeeName(String employeeName);

	List<Employee> getEmployeesByEmployeeDeprtment(String employeeDept);


}
