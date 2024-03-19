package com.employee.service;

import java.util.List;

import com.employee.entities.Task;

public interface TaskService {
	
	public boolean saveTask(Task task);

	List<Task> getTask(Task task);
	
	Task getTaskById(int taskid);
	
	public boolean updateTask(int taskid);
	
	public boolean deleteTask(int taskid);
	
}