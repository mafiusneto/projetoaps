package com.edrick.scrum.bc;

import com.edrick.scrum.dao.DAOProject;
import com.edrick.scrum.entity.Project;
import com.edrick.scrum.entity.User;

public class ProjectBC {
	private Project project;
	private DAOProject dao;
	private User user;
	
	public ProjectBC(){}
	public ProjectBC(User user){
		this.user = user;
		dao = new DAOProject();
	}
	
	@SuppressWarnings("static-access")
	public Project newProject(String name, String description){
		project = new Project(user, name, description);
		dao.open();
		dao.begin();
		dao.create(project);
		dao.commit();
		return project;
	}
	
	public Project loadProject(long id){
		return dao.read(id);
	}
	
	public Project editProject(Project project){
		this.project = project;
		return this.project;
	}
	
	public void deleteProject(long id){
		
	}
}
