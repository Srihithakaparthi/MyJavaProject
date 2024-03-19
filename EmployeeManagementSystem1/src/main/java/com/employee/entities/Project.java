package com.employee.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ColumnDefault;

@Entity
public class Project {
	
	@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int projectId;

    private double budget;

    private String status;
    
    @ColumnDefault("'A'")
    private char record_status;
    
    @ManyToOne
    private Employee employee;

    public Project() {
        
    }

	public Project(int projectId, double budget, String status, char record_status, Employee employee) {
		super();
		this.projectId = projectId;
		this.budget = budget;
		this.status = status;
		this.record_status = 'A';
		this.employee = employee;
	}

	public double getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = (int) projectId;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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