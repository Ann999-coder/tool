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

import com.jwt.model.Client;
import com.jwt.services.Impl.IclientService;

@CrossOrigin(origins="*")
@RestController
public class clientController {
	
	@Autowired
	IclientService clientservice;

	@RequestMapping("/client")
	public String test() {

		return "hello";

	}
	
	@PostMapping("/client/save")
	public ResponseEntity<HttpStatus> add(@RequestBody Client client){
		
		clientservice.add(client);
		return ResponseEntity.ok(HttpStatus.OK);
		
	}
	
	@GetMapping("client/all")
	public List<Client> getAll(){
		
		return clientservice.list();
		
	}
	
	@PutMapping(value="/client/update/{client_id}",produces = "application/json")
	public ResponseEntity<HttpStatus> update(@PathVariable("client_id") Long Id,@RequestBody Client client){
		
		clientservice.update(client,Id);
		
		return ResponseEntity.ok(HttpStatus.OK);
		
		
	}
	
	@GetMapping("client/edit/{client_id}")
	public  Optional<Client> getById(@PathVariable("client_id") Long Id){
	 return clientservice.getById(Id);
	 
	 

	}
	
	
	@DeleteMapping(value="/client/delete/{id}",produces = "application/json")
	public ResponseEntity<HttpStatus> deleteById(@PathVariable("id") Long Id) {
		clientservice.delete(Id);
		return ResponseEntity.ok(HttpStatus.OK);
	  }

	


}
