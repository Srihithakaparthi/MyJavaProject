package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	private int departmentId;
    private String departmentName;
    private String location;
    
	public Department(int departmentId, String departmentName, String location) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.location = location;
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
    

}
