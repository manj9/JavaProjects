package com.service;

import com.dao.UserDao;

public class UserServiceImpl implements UserService{
	
	private UserDao userDao;
	

	public UserDao getUserDao() {
		return userDao;
	}


	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	public boolean isValidUser(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
