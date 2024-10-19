package com.project.back.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.back.model.Client;
import com.project.back.service.ClientService;

@RestController
public class ClientController {

	@Autowired
	private ClientService clientService;
	
	// hello world
	@GetMapping("/")
	public String helloworld() {
		return "Hello World!!";
	}
	
	// create Client
	@PostMapping("/add")
	public Client createClient(@RequestBody Client client) {
		Client clt = clientService.createClient(client);
		return clt;
	}

	// read Clients
	@GetMapping("/clients")
	public List<Client> getClients() {
		return clientService.getClients();
	}

	// get Client By shared_key
	@GetMapping("/client/{shared_key}")
	public Client getClientByShared_key(@PathVariable("shared_key") String shared_key) {
		return clientService.getClientByShared_key(shared_key);
	}
}
