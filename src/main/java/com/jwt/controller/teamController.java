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

import com.jwt.model.Team;
import com.jwt.services.Impl.Iteamservice;

@CrossOrigin(origins="*")
@RestController
public class teamController {
	
	@Autowired
	Iteamservice iteamservice;
	
	@RequestMapping("/team")
	public String trial() {

		return "hello";

	}
	
	@PostMapping("/team/save")
	public ResponseEntity<HttpStatus> add(@RequestBody Team team){
		
		iteamservice.add(team);
		return ResponseEntity.ok(HttpStatus.OK);
		
	}
	
	@GetMapping("team/all")
	public List<Team> getAll(){
		
		return iteamservice.list();
		
	}
	
	@PutMapping(value="/team/update/{team_id}",produces = "application/json")
	public ResponseEntity<HttpStatus> update(@PathVariable("team_id") Long Id,@RequestBody Team team){
		
		iteamservice.update(team,Id);
		
		return ResponseEntity.ok(HttpStatus.OK);
		
		
	}
	
	@GetMapping("team/edit/{team_id}")
	public  Optional<Team> getById(@PathVariable("team_id") Long Id){
	 return iteamservice.getById(Id);
	 
	 

	}
	
	
	@DeleteMapping(value="/team/delete/{id}",produces = "application/json")
	public ResponseEntity<HttpStatus> deleteById(@PathVariable("id") Long Id) {
		iteamservice.delete(Id);
		return ResponseEntity.ok(HttpStatus.OK);
	  }




}
