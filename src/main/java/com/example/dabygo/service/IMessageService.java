package com.example.dabygo.service;

import com.example.dabygo.entities.Adminstrateur;
import com.example.dabygo.entities.Message;

public interface IMessageService {
	public Message Addmessage(Message mes) ;
	public String deletemessage(Long idmes);
		
	

}
