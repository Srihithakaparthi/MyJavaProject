package com.employee.serviceImpl;

import java.util.List;

import com.employee.dao.AttendenceDAO;
import com.employee.daoImpl.AttendenceDAOImpl;
import com.employee.entities.Attendence;
import com.employee.service.AttendenceService;

public class AttendenceServiceImpl implements AttendenceService {
     AttendenceDAO attendencedao = new AttendenceDAOImpl();
     
     @Override
	public boolean saveAttendence(Attendence attendence) {
		return attendencedao.saveAttendence(attendence);	
	} 
     
     @Override
	public List<Attendence> getAttendence(Attendence attendence) {
		return attendencedao.getAttendence(attendence);
	}
    
     @Override
	public Attendence getAttendenceById(int attendenceid) {
		return attendencedao.getAttendenceById(attendenceid);
	}
     
     @Override
	public boolean updateAttendence(int attendenceid) {
		return attendencedao.updateAttendence(attendenceid);	
	}
     
     @Override
	public boolean deleteAttendence(int attendenceid) {
		return attendencedao.deleteAttendence(attendenceid);	
	}
	
}