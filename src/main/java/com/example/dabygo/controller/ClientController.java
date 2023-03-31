package com.example.dabygo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.dabygo.entities.Client;
import com.example.dabygo.service.ClientService;

@RestController
@CrossOrigin
public class ClientController {
	
	@Autowired
	ClientService clientServ;
	
	
	@PostMapping(value = "/addClient")
	public Client addClient(@RequestBody Client cl) {
		
		return clientServ.addClient(cl);
	}
	@PutMapping(value = "/updateClient/{idClient}")
	public Client updateClient(@RequestBody Client cl,@PathVariable Long idClient) {
		
		
		return clientServ.updateclient(cl, idClient);
	}
	@DeleteMapping(value = "/DeleteClient/{idClient}")
	public String deleteClient(@PathVariable Long idClient) {
		
		
		return clientServ.deleteClient(idClient);
	}

}
