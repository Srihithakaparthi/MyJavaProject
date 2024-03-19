package com.employee.service;

import java.util.List;

import com.employee.entities.Leaves;

public interface LeaveService {
	
	public boolean saveLeave(Leaves leave);

	List<Leaves> getLeave(Leaves leave);
	
	Leaves getLeaveById(int leaveId);
	
	public boolean updateLeave(int leaveid);
	
	public boolean deleteLeave(int leaveid);
	
}
