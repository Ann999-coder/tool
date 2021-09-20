package com.jwt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.model.User;

public interface registerRepository extends  JpaRepository<User, Long> {

	public User findByUsername(String username);
	
	public User findByUsernameAndPassword(String username,String password); 

}
