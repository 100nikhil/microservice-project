package com.cognizant.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.cognizant.entity.Employee;

@Service
public class EmployeeService {
	
	List<Employee> employees = List.of(
	new Employee(1,"Nikhil",123123.0,1),
	new Employee(2,"Amit",23123.20,2),
	new Employee(3,"Sunaina",56423.75,3),
	new Employee(4,"Amanda",34123.50,2),
	new Employee(5,"Valentina",93493.0,1)
	);

	public List<Employee> getAllEmployees() {
		return employees;
	}
	public List<Employee> getEmployeeByDepartmentId(int id) {
		return employees.stream().filter(emp-> emp.getDepartmentId()==id).collect(Collectors.toList());
	}

	
}
