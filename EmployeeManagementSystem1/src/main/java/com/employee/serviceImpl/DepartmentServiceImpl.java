package com.employee.serviceImpl;

import java.util.List;

import com.employee.dao.DepartmentDAO;
import com.employee.daoImpl.DepartmentDAOImpl;
import com.employee.entities.Department;
import com.employee.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {
    DepartmentDAO departmentdao = new DepartmentDAOImpl();
    
    @Override
	public boolean saveDepartment(Department department) {
		return departmentdao.saveDepartment(department);	
	}
    
    @Override
	public List<Department> getDepartment(Department department) {
		return departmentdao.getDepartment(department);
	}
    
    @Override
	public void getDepartmentById(int departmentid) {
		departmentdao.getDepartmentById(departmentid);
		
	}
    
    @Override
	public boolean updateDepartment(int departmentid) {
		return departmentdao.updateDepartment(departmentid);
		
	}
    
    @Override
	public boolean deleteDepartment(int departmentid) {
		return departmentdao.deleteDepartment(departmentid);
		
	}
	
}