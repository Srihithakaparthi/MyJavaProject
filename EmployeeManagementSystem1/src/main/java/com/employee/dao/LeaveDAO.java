package com.employee.dao;

import java.util.List;

import com.employee.entities.Leave;

public interface LeaveDAO {
	
	public boolean saveLeave(Leave leave);

	List<Leave> getLeave(Leave leave);

	Leave getLeaveById(int leaveId);
	
	public boolean updateLeave(int leaveid);
	
	public boolean deleteLeave(int leaveid);
}