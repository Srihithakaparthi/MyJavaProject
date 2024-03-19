package com.employee.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ColumnDefault;

@Entity
public class Department {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	
    private int departmentId;
	
    private String departmentName;
    
    private String location;
    
    @ColumnDefault("'A'")
    private char record_status;

    @ManyToOne
    private Employee employee;
    
    public Department() {
    	
    }

	public Department(int departmentId, String departmentName, String location, char record_status, Employee employee) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.location = location;
		this.record_status = 'A';
		this.employee = employee;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public char getRecord_status() {
		return record_status;
	}

	public void setRecord_status(char record_status) {
		this.record_status = record_status;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	
	
}
