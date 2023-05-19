package com.example.dabygo.service;

import com.example.dabygo.entities.Adminstrateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.dabygo.entities.Client;
import com.example.dabygo.repository.ClientRepository;

import java.util.List;
import java.util.Optional;


@Service
public class ClientService implements IClientService{
	
	@Autowired
	ClientRepository clientRep;

	@Override
	public Client addClient(Client client) {
		// TODO Auto-generated method stub
		return clientRep.save(client);
	}

	@Override
	public Client updateclient(Client client, Long idClient) {
		// TODO Auto-generated method stub
		Client cl =  clientRep.findById(idClient).get();
		cl.setNom(client.getNom());
		cl.setPrenom(client.getPrenom());
		cl.setAdresse(client.getAdresse());
		cl.setEmail(client.getEmail());
		cl.setLogin(client.getLogin());
		cl.setPassword(client.getPassword());
		cl.setConfirmpassword(client.getConfirmpassword());
       
		return clientRep.save(cl) ;
	}

	@Override
	public String deleteClient(Long idClient) {
		// TODO Auto-generated method stub
		String ch="";
		if(clientRep.existsById(idClient)) {
			clientRep.deleteById(idClient);
			ch="Client deleted successfuly";
		}
		else
		{
			ch="Client doesn't exist";
		}
		return ch;
	}

	@Override
	public List<Client> findallClient() {
		return clientRep.findAll();
	}

	@Override
	public Client findClientbyid(Long idClient) {
		String ch="not found";

		Optional<Client> client = clientRep.findById(idClient);
		if (client.isPresent()) {
			return client.get();
		}
		return null;
	}

}
