package com.employee.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ColumnDefault;

@Entity
public class Leave {
	@Id
	private int leaveId;
	
    private LocalDate startDate;
    
    private LocalDate endDate;
    
    private String reason;

    @ColumnDefault("'A'")
    private char record_status;
    
    @ManyToOne
    @JoinColumn(name = "employee_id") // This column will be added in the Leave table to reference the Employee
    private Employee employee;
    
    public Leave() {
    	
    }

	public Leave(int leaveId, LocalDate startDate, LocalDate endDate, String reason, char record_status, Employee employee) {
		super();
		this.leaveId = leaveId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.reason = reason;
		this.record_status = record_status;
		this.employee = employee;
	}

	public int getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
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
