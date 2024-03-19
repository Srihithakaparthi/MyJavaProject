package com.employee.dao;

import java.util.List;

import com.employee.entities.Employee;

public interface EmployeeDAO {
	
	public boolean saveEmployee(Employee employee);
	
	List<Employee> getEmployee(Employee employee);
	
	Employee getEmployeeById(int employeeId);
	
	public boolean updateEmployee(int employeeid);
	
	public boolean deleteEmployee(int employeeid);

	

}
