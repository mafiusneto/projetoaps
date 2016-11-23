package com.edrick.test.scrum.bc;

import org.junit.Test;

import com.edrick.scrum.bc.ProjectBC;
import com.edrick.scrum.entity.Project;
import com.edrick.scrum.entity.User;

public class ProjectBCTest {
	private ProjectBC projectBC;
	
	@Test
	public void createProject(){
		User edrick = new User("edrick", "edrickrenan@gmail.com", "123");
		projectBC = new ProjectBC(edrick);
		projectBC.newProject("Projeto01","teste");
	}
}
