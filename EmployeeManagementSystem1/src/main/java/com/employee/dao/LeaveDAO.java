package com.employee.dao;

import java.util.List;

import com.employee.entities.Leaves;

public interface LeaveDAO {
	
	public boolean saveLeave(Leaves leave);

	List<Leaves> getLeave(Leaves leave);

	Leaves getLeaveById(int leaveId);
	
	public boolean updateLeave(int leaveid);
	
	public boolean deleteLeave(int leaveid);
}