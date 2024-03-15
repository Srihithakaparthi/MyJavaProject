package com.employee.service;

import java.util.List;

import com.employee.entities.Attendence;

public interface AttendenceService {
	
	public boolean saveAttendence(Attendence attendence);

	List<Attendence> getAttendence(Attendence attendence);
	
	public void getAttendenceById(int attendenceid);
	
	public boolean updateAttendence(int attendenceid);
	
	public boolean deleteAttendence(int attendenceid);
	
}
