package com.example.employeeManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeeManagement.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String>{

	List<Employee> findEmployeesByemployeeName(String employeeName);

	List<Employee> findEmployeesByEmployeeDepartment(String employeeDept);


}
