package com.employee.dao;

import java.util.List;

import com.employee.entities.Task;

public interface TaskDAO {
	
	public boolean saveTask(Task task);

	List<Task> getTask(Task task);

	Task getTaskById(int taskId);
	
	public boolean updateTask(int taskid);
	
	public boolean deleteTask(int taskid);

}