package com.example.dabygo.controller;

import com.example.dabygo.entities.Adminstrateur;
import com.example.dabygo.entities.DAB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.example.dabygo.entities.Client;
import com.example.dabygo.service.ClientService;

import java.util.List;

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

	@GetMapping(value = "/GetAllclient")
	public List<Client> GetAllAdmin() {


		return clientServ.findallClient();
	}

	@GetMapping(value = "/Getclient/{idClient}")
	public Client GetClient( @PathVariable Long idClient) {


		return clientServ.findClientbyid(idClient);
	}

}
