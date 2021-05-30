package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cognizant.entity.Department;

@Service
public class DepartmentService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	List<Department> list = List.of(
				new Department(1,"Developers",20),
				new Department(2,"Designers",15),
				new Department(3,"Finance",12)
			);

	public Department getByDepartmentId(int id) {
		Department d = list.get(id-1);
		List employees = restTemplate.getForObject("http://EMPLOYEE-MICROSERVICE/employee/"+id, List.class);		
		d.setEmployees(employees);
		
		return d;
	}
	
	
	
}
