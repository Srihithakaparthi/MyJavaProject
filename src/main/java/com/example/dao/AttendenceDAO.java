package com.example.dao;

import java.util.List;

import com.example.entities.Attendence;

public interface AttendenceDAO {
	public void saveAttendence(Attendence attendence);
	public void getAttendenceById(int attendenceid);
	public void updateAttendence(int attendenceid);
	public void deleteAttendence(int attendenceid);
	
	List<Attendence> getAttendence(Attendence attendence);
	
}
