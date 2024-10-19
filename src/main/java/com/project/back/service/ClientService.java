package com.project.back.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.back.model.Client;

@Service
public interface ClientService {

	// create a client
	public Client createClient(Client client);
	
	// read clients
	public List<Client> getClients();
	
	// read client by shared_key
	public Client getClientByShared_key(String shared_key);
	
}
