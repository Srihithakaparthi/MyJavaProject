package com.employee.service;

import java.util.List;

import com.employee.entities.Leave;

public interface LeaveService {
	
	public boolean saveLeave(Leave leave);

	List<Leave> getLeave(Leave leave);
	
	Leave getLeaveById(int leaveId);
	
	public boolean updateLeave(int leaveid);
	
	public boolean deleteLeave(int leaveid);
	
}
