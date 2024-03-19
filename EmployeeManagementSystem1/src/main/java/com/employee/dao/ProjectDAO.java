package com.employee.dao;

import java.util.List;

import com.employee.entities.Project;

public interface ProjectDAO {
	
	public boolean saveProject(Project project);

	List<Project> getProject(Project project);

	Project getProjectById(int ProjectId);
	
	public boolean updateProject(int projectid);
	
	public boolean deleteProject(int projectid);

}