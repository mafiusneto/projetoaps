package com.edrick.scrum.bc;

import com.edrick.scrum.dao.DAOUser;
import com.edrick.scrum.entity.User;

public class UserBC {
	private User user;
	private DAOUser dao;
	
	public UserBC(User user){
		this.user = user;
		dao = new DAOUser();
	}
	@SuppressWarnings("static-access")
	public User createUser(User user){
		dao.open();
		dao.begin();
		dao.create(user);
		dao.commit();
		return user;
	}
}
