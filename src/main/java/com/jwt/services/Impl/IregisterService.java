package com.jwt.services.Impl;

import com.jwt.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwt.repo.UserRepository;
import com.jwt.services.registerService;
@Service
public class IregisterService implements registerService {

	@Autowired
	private UserRepository regrepository;
	
	@Override
	public User add(User user) {
		// TODO Auto-generated method stub
		return regrepository.save(user);
	}

	@Override
	public User fetchUserByUsername(String username) {
		// TODO Auto-generated method stub
		return regrepository.findByUsername(username);
	}

	@Override
	public User fetchUserByUsernameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		return regrepository.findByUsernameAndPassword(username, password);
	}
}
