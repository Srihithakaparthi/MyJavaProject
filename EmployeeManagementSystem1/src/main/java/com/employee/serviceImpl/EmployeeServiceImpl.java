package com.employee.serviceImpl;

import java.util.List;

import com.employee.dao.EmployeeDAO;
import com.employee.daoImpl.EmployeeDAOImpl;
import com.employee.entities.Employee;
import com.employee.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDAO employeedao = new EmployeeDAOImpl();    
   
@Override
public boolean saveEmployee(Employee employee) {
	return employeedao.saveEmployee(employee);
	
}

@Override
public List<Employee> getEmployee(Employee employee) {
	 return employeedao.getEmployee(employee);
}

@Override
public void getEmployeeById(int employeeid) {
	employeedao.getEmployeeById(employeeid);
	
}

@Override
public boolean updateEmployee(int employeeid) {
	return employeedao.updateEmployee(employeeid);
	
}

public boolean deleteEmployee(int employeeid) {
	return employeedao.deleteEmployee(employeeid);
	
}

@Override
public boolean deleteEmployee(String string) {
	// TODO Auto-generated method stub
	return false;
}


   
}
