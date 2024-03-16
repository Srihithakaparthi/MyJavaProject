package com.employee.service;

import java.util.List;

import com.employee.entities.Department;

public interface DepartmentService {
	

	boolean saveDepartment(Department department);
	
	List<Department> getDepartment(Department department);
	
	Department getDepartmentById(int departmentid);
	
	public boolean updateDepartment(int departmentid);
	
	public boolean deleteDepartment(int departmentid);

}