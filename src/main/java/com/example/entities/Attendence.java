package com.example.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Attendence {
	 @Id
	private int attendanceId;
    private int employeeId;
    private Date date;
    private String timeIn;
    private String timeOut;
    
	public Attendence(int attendanceId, int employeeId, Date date, String timeIn, String timeOut) {
		super();
		this.attendanceId = attendanceId;
		this.employeeId = employeeId;
		this.date = date;
		this.timeIn = timeIn;
		this.timeOut = timeOut;
	}
	public int getAttendanceId() {
		return attendanceId;
	}
	public void setAttendanceId(int attendanceId) {
		this.attendanceId = attendanceId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTimeIn() {
		return timeIn;
	}
	public void setTimeIn(String timeIn) {
		this.timeIn = timeIn;
	}
	public String getTimeOut() {
		return timeOut;
	}
	public void setTimeOut(String timeOut) {
		this.timeOut = timeOut;
	}
    
    

}
