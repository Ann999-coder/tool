package com.jwt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.model.Project;
import com.jwt.repo.projectRepository;
import com.jwt.services.Impl.IprojectService;

@CrossOrigin(origins="*")
@RestController
public class projectController {
	
	@Autowired
	IprojectService projectservice;
	projectRepository projectrepository;

	@RequestMapping("/project")
	public String hello() {

		return "hello";

	}
	
	@PostMapping(value="/project/save",produces = "application/json")
	public ResponseEntity<HttpStatus> add(@RequestBody Project project){
		
		projectservice.add(project);
		return ResponseEntity.ok(HttpStatus.OK);
		
	}
	
	@GetMapping("project/all")
	public List<Project> getAll(){
		
		return projectservice.list();
		
	}
	
	@PutMapping(value="/project/update/{project_id}",produces = "application/json")
	public ResponseEntity<HttpStatus> update(@PathVariable("project_id") Long Id,@RequestBody Project project){
		
		projectservice.update(project,Id);
		
		return ResponseEntity.ok(HttpStatus.OK);
		
		
	}
	
	@GetMapping("project/edit/{projectid}")
	public  Optional<Project> getById(@PathVariable("projectid") Long Id){
	 return projectservice.getById(Id);
	 
	 

	}
	
	
	@DeleteMapping(value="/project/delete/{id}",produces = "application/json")
	public ResponseEntity<HttpStatus> deleteById(@PathVariable("id") Long Id) {
		projectservice.delete(Id);
		return ResponseEntity.ok(HttpStatus.OK);
	  }


}
