package com.jwt.services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwt.model.Client;
import com.jwt.repo.clientRepository;
import com.jwt.services.*;

@Service
public class IclientService implements clientService {

	@Autowired
	private clientRepository clientrepository;
	
	@Override
	public void add(Client client) {
		// TODO Auto-generated method stub
		clientrepository.save(client);
		
	}

	@Override
	public void update(Client client, Long clientid) {
		// TODO Auto-generated method stub
		
Optional<Client> clientData= clientrepository.findById(clientid);
		
		if (clientData.isPresent()) {
			Client _client = clientData.get();
		      _client.setCompany(client.getCompany());
		      _client.setWebsite(client.getWebsite());
		      _client.setContact(client.getContact());
		      _client.setEmail(client.getEmail());
		      _client.setUserName(client.getUserName());
		      _client.setPassword(client.getPassword());
		      
		      clientrepository.save(_client);
		}
		
	}

	@Override
	public Optional<Client> getById(Long clientid) {
		// TODO Auto-generated method stub
		return clientrepository.findById(clientid);
	}

	@Override
	public void delete(Long clientid) {
		// TODO Auto-generated method stub
		clientrepository.deleteById(clientid);
		
	}

	@Override
	public List<Client> list() {
		// TODO Auto-generated method stub
		return clientrepository.findAll();
	}

}

