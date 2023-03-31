package com.example.dabygo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dabygo.entities.Message;
import com.example.dabygo.repository.messageRepository;



@Service
public class MessageService implements IMessageService {
	
	@Autowired
	messageRepository MesRep;

	@Override
	public Message Addmessage(Message mes) {
		// TODO Auto-generated method stub
		return MesRep.save(mes);
	}

	@Override
	public String deletemessage(Long idmes) {
		// TODO Auto-generated method stub
		String ch="";
		if(MesRep.existsById(idmes)) {
			MesRep.deleteById(idmes);
			ch="Message deleted successfuly";
		}
		else
		{
			ch="message doesn't exist";
		}
		return ch;
	}

}
