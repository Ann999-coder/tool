package com.jwt.services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwt.model.Project;
import com.jwt.repo.projectRepository;
import com.jwt.services.projectService;

@Service
public class IprojectService implements projectService {

	@Autowired
	private projectRepository projectrepository;
	
	@Override
	public void add(Project project) {
		// TODO Auto-generated method stub
		
		projectrepository.save(project);
		
	}

	@Override
	public void update(Project project, Long projectid) {
		// TODO Auto-generated method stub
		
		Optional<Project> projectData= projectrepository.findById(projectid);
		
		if (projectData.isPresent()) {
			Project _project = projectData.get();
		      _project.setProjectName(project.getProjectName());
		      _project.setType(project.getType());
		      _project.setSubject(project.getSubject());
		      
		     projectrepository.save(_project);
		}
		
		
	}

	@Override
	public Optional<Project> getById(Long projectid) {
		// TODO Auto-generated method stub
		return  projectrepository.findById(projectid);
	}

	@Override
	public void delete(Long projectid) {
		// TODO Auto-generated method stub
		
		projectrepository.deleteById(projectid);
		
	}

	@Override
	public List<Project> list() {
		// TODO Auto-generated method stub
		return projectrepository.findAll();
	}

}
