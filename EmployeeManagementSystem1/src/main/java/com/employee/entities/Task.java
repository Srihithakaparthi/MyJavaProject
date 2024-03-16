package com.employee.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ColumnDefault;

@Entity
public class Task {
   @Id
   //@GeneratedValue(strategy = GenerationType.IDENTITY)
   private int taskId;
   
   private String taskName;
   
   private LocalDate startDate;
   
   private LocalDate endDate;

   @ColumnDefault("'A'")
   private char record_status;
   
   @ManyToOne
   private Employee employee;
   
	public Task() {
		
	}
	
	
	public Task(int taskId, String taskName, LocalDate startDate, LocalDate endDate, char record_status, Employee employee) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.record_status = 'A';
		this.employee = employee;
	}


	public int getTaskId() {
		return taskId;
	}
	
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	
	public String getTaskName() {
		return taskName;
	}
	
	public void setTaskName(String taskName) {
		this.taskName = taskName;
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
