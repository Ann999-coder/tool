package com.jwt.services;

import java.util.List;
import java.util.Optional;

import com.jwt.model.Client;

public interface clientService {

	public void add(Client client);
	public void update(Client client,Long clientid);
	Optional<Client> getById(Long clientid);
	
	public void delete(Long clientid);
	
	
	List<Client> list();
}
