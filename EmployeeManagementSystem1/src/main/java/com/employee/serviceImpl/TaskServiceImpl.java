package com.employee.serviceImpl;

import java.util.List;

import com.employee.dao.TaskDAO;
import com.employee.daoImpl.TaskDAOImpl;
import com.employee.entities.Task;
import com.employee.service.TaskService;

public class TaskServiceImpl implements TaskService {
    TaskDAO taskdao = new TaskDAOImpl();
    
    @Override
	public boolean saveTask(Task task) {
		return taskdao.saveTask(task);	
	}
    
    @Override
	public List<Task> getTask(Task task) {
		return taskdao.getTask(task);
	}
    
    @Override
	public Task getTaskById(int taskid) {
		return taskdao.getTaskById(taskid);	
	}

    @Override
	public boolean updateTask(int taskid) {
		return taskdao.updateTask(taskid);	
	}

    @Override
	public boolean deleteTask(int taskid) {
		return taskdao.deleteTask(taskid);
		
	}
}
