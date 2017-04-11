package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.bean.User;
import com.test.repo.UserRepo;

@Service
public class UserService implements UserServiceInterface {

	@Autowired
	UserRepo userRepo;

	@Override
	public void save(User user) {
		
		userRepo.save(user);
		
	}
	
	
	
	
	
}
