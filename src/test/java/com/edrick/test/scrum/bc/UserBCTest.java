package com.edrick.test.scrum.bc;

import org.junit.Test;

import com.edrick.scrum.bc.UserBC;
import com.edrick.scrum.entity.User;

public class UserBCTest {
	private User user;
	private UserBC userBC;
	@Test
	public void createUser(){
		user = new User("Renan","edrickrenan@gmail.com","123456");
		userBC = new UserBC(user);
		user = userBC.createUser(user);
	}
}
