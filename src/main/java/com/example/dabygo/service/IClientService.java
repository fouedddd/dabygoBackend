package com.example.dabygo.service;


import com.example.dabygo.entities.Adminstrateur;
import com.example.dabygo.entities.Client;

import java.util.List;

public interface IClientService {
	
	
	public Client addClient(Client client);
	public Client updateclient(Client client, Long idClient);
	public String deleteClient(Long idClient);
	public List<Client> findallClient();
	public  Client findClientbyid(Long idClient);

}
