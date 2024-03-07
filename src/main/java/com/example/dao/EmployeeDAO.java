package com.example.dao;

import java.util.List;

import com.example.entities.Employee;

public interface EmployeeDAO {
	public void saveEmployee(Employee employee);
	public void getEmployeeById(int employeeid);
	public void updateEmployee(int employeeid);
	public void deleteEmployee(int employeeid);
	
	List<Employee> getEmployee(Employee employee);
	
}
