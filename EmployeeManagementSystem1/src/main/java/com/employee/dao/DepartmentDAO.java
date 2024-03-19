package com.employee.dao;

import java.util.List;

import com.employee.entities.Department;

public interface DepartmentDAO {
	
	public boolean saveDepartment(Department department);
	
	List<Department> getDepartment(Department department);
	
	Department getDepartmentById(int departmentId);
	
	public boolean updateDepartment(int departmentid);
	
	public boolean deleteDepartment(int departmentid);

	
}