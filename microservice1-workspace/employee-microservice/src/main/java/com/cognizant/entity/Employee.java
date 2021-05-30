package com.cognizant.entity;

public class Employee {
	int id;
	String name;
	double salary;
	int departmentId;

	public Employee() {

	}

	public Employee(int id, String name, double salary, int departmentId) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.departmentId = departmentId;
	}
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", departmentId=" + departmentId
				+ "]";
	}

}
