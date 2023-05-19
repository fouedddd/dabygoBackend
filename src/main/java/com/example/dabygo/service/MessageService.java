package com.example.dabygo.service;

import com.example.dabygo.entities.Adminstrateur;
import com.example.dabygo.entities.Client;
import com.example.dabygo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dabygo.entities.Message;
import com.example.dabygo.repository.messageRepository;

import java.util.List;


@Service
public class MessageService implements IMessageService {

	@Autowired
	messageRepository MesRep;



	public Message Addmessage(Message message) {
		// TODO Auto-generated method stub

		return MesRep.save(message);
	}



	@Override
	public String deletemessage(Long idmes) {
		// TODO Auto-generated method stub
		String ch="";
		if(MesRep.existsById(idmes)) {
			MesRep.deleteById(idmes);
			ch="Message deleted successfuly";
		} else {
			ch="message doesn't exist";
		}
		return ch;
	}

	@Override
	public List<Message> findallMessage() {
		return MesRep.findAll();
	}

}
