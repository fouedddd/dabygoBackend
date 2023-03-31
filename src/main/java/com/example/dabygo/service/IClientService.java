package com.example.dabygo.service;


import com.example.dabygo.entities.Client;

public interface IClientService {
	
	
	public Client addClient(Client client);
	public Client updateclient(Client client, Long idClient);
	public String deleteClient(Long idClient);

}
