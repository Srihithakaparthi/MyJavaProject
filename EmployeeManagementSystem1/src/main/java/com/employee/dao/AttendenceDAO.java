package com.employee.dao;

import java.util.List;

import com.employee.entities.Attendence;

public interface AttendenceDAO {
	
	public boolean saveAttendence(Attendence attendence);
	
	List<Attendence> getAttendence(Attendence attendence);
	
	Attendence getAttendenceById(int attendenceId);	
	
	public boolean updateAttendence(int attendenceid);
	
	public boolean deleteAttendence(int attendenceid);

	
}
