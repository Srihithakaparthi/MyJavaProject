package com.employee.service;

import java.util.List;

import com.employee.entities.Project;

public interface ProjectService {
	
	public boolean saveProject(Project project);

	List<Project> getProject(Project project);
	
	public void getProjectById(int projectid);
	
	public boolean updateProject(int projectid);
	
	public boolean deleteProject(int projectid);
	
}
