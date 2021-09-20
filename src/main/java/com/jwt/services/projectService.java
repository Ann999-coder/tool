package com.jwt.services;

import java.util.List;
import java.util.Optional;

import com.jwt.model.Project;

public interface projectService {

	public void add(Project project);
	public void update(Project project,Long projectid);
	Optional<Project> getById(Long projectid);
	
	public void delete(Long projectid);
	 
	
	List<Project> list();
}
