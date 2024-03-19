package com.employee.serviceImpl;

import java.util.List;

import com.employee.dao.LeaveDAO;
import com.employee.daoImpl.LeaveDAOImpl;
import com.employee.entities.Leaves;
import com.employee.service.LeaveService;

public class LeaveServiceImpl implements LeaveService {
    LeaveDAO leavedao = new LeaveDAOImpl();
  
    @Override
	public boolean saveLeave(Leaves leave) {
		return leavedao.saveLeave(leave);	
	}
    
    @Override
	public List<Leaves> getLeave(Leaves leave) {
		 return leavedao.getLeave(leave);
	}

    @Override
	public Leaves getLeaveById(int leaveid) {
		return leavedao.getLeaveById(leaveid);	
	}

    @Override
	public boolean updateLeave(int leaveid) {
		return leavedao.updateLeave(leaveid);	
	}

    @Override
	public boolean deleteLeave(int leaveid) {
		return leavedao.deleteLeave(leaveid);
	}
	
}