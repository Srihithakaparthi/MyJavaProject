package com.example.entities;

import java.sql.Date;

public class Employee {
	private int employeeID;
    private String Name;
    private Date Dateofbirth;
    private String Email;
    private String phonenumber;
	public int getEmployeeID() {
		return employeeID;
	}
	public Employee(int employeeID, String name, Date dateofbirth, String email, String phonenumber) {
		super();
		this.employeeID = employeeID;
		Name = name;
		Dateofbirth = dateofbirth;
		Email = email;
		this.phonenumber = phonenumber;
	}
    
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Date getDateofbirth() {
		return Dateofbirth;
	}
	public void setDateofbirth(Date dateofbirth) {
		Dateofbirth = dateofbirth;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
    
	
 }
