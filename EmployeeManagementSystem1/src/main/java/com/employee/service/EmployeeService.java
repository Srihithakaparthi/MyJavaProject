package com.employee.service;

import java.util.List;

import com.employee.entities.Employee;

public interface EmployeeService {
	
	public boolean saveEmployee(Employee employee);

	List<Employee> getEmployee(Employee employee);
	
	public void getEmployeeById(int employeeid);
	
	public boolean updateEmployee(int employeeid);
	
	public boolean deleteEmployee(String string);
}
