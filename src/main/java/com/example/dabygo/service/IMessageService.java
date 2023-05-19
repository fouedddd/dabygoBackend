package com.example.dabygo.service;

import com.example.dabygo.entities.Adminstrateur;
import com.example.dabygo.entities.Client;
import com.example.dabygo.entities.Message;

import java.util.List;

public interface IMessageService {
	public Message Addmessage(Message mes) ;
	public String deletemessage(Long idmes);
	public List<Message> findallMessage();
		
	

}
