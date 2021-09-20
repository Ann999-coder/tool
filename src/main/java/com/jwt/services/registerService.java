package com.jwt.services;



import com.jwt.model.User;

public interface registerService {

//	public User add(User user);
//	public User fetchUserByEmailId(String email);
//	public User fetchUserByEmailIdAndPassword(String email,String password);
	
	public User add(User user);
	public User fetchUserByUsername(String username);
	public User fetchUserByUsernameAndPassword(String username,String password);
}
