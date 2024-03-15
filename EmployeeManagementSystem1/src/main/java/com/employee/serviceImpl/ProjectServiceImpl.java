package com.employee.serviceImpl;

import java.util.List;

import com.employee.dao.ProjectDAO;
import com.employee.daoImpl.ProjectDAOImpl;
import com.employee.entities.Project;
import com.employee.service.ProjectService;

public class ProjectServiceImpl implements ProjectService {
    ProjectDAO projectdao = new ProjectDAOImpl();
   
    @Override
    public boolean saveProject(Project project) {
    	return projectdao.saveProject(project);
	}
    
    @Override
    public List<Project> getProject(Project project) {
		return projectdao.getProject(project) ;
	}
   
    @Override
	public void getProjectById(int projectid) {
		projectdao.getProjectById(projectid);
	}

    @Override
	public boolean updateProject(int projectid) {
		return projectdao.updateProject(projectid);
	}

    @Override
	public boolean deleteProject(int projectid) {
		return projectdao.deleteProject(projectid);
	}	
}