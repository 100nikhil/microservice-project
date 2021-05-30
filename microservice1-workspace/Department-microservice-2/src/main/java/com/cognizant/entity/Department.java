package com.cognizant.entity;

import java.util.List;

public class Department {
	int id;
	String departmentName;
	int departmentNoOfEmployees;
	List<Employee> employees;

	public Department() {

	}

	public Department(int id, String departmentName, int departmentNoOfEmployees) {
		super();
		this.id = id;
		this.departmentName = departmentName;
		this.departmentNoOfEmployees = departmentNoOfEmployees;
	}

	public Department(int id, String departmentName, int departmentNoOfEmployees, List<Employee> employees) {
		super();
		this.id = id;
		this.departmentName = departmentName;
		this.departmentNoOfEmployees = departmentNoOfEmployees;
		this.employees = employees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getDepartmentNoOfEmployees() {
		return departmentNoOfEmployees;
	}

	public void setDepartmentNoOfEmployees(int departmentNoOfEmployees) {
		this.departmentNoOfEmployees = departmentNoOfEmployees;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName + ", departmentNoOfEmployees="
				+ departmentNoOfEmployees + ", employees=" + employees + "]";
	}

}
