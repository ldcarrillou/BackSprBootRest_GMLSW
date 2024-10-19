package com.project.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.back.model.Client;
import com.project.back.repository.ClientRepository;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	@Override
	public Client createClient(Client client) {
		// TODO Auto-generated method stub
		return clientRepository.save(client);
	}

	@Override
	public List<Client> getClients() {
		// TODO Auto-generated method stub
		return (List<Client>)clientRepository.findAll();
	}

	@Override
	public Client getClientByShared_key(String shared_key) {
		// TODO Auto-generated method stub
		return clientRepository.findById(shared_key).get();
	}

}
