package com.employee.entities;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ColumnDefault;

@Entity
public class Attendence {
	 @Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int attendanceId;
	 
	    private LocalDate date;
	    
	    private String timeIn;
	    
	    private String timeOut;
	    
	    @ColumnDefault("'A'")
	    private char record_status;
	    
	    @ManyToOne
	    private Employee employee;

	    public Attendence() {
	    	
	    }
	    
		public Attendence(int attendanceId, LocalDate date, String timeIn, String timeOut, char record_status,	Employee employee) {
			super();
			this.attendanceId = attendanceId;
			this.date = date;
			this.timeIn = timeIn;
			this.timeOut = timeOut;
			this.record_status = 'A';
			this.employee = employee;
		}

		public int getAttendanceId() {
			return attendanceId;
		}

		public void setAttendanceId(int attendanceId) {
			this.attendanceId = attendanceId;
		}

		public LocalDate getDate() {
			return date;
		}

		public void setDate(LocalDate date) {
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