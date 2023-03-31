package com.example.dabygo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.dabygo.entities.Message;
import com.example.dabygo.service.MessageService;

@RestController
@CrossOrigin
public class MessageController {
	
	@Autowired
	MessageService messageServ;
	
	
	@PostMapping(value = "/addMessage")
	public Message addMessage(@RequestBody Message mes) {
		
		return messageServ.Addmessage(mes);
	}
	
	@DeleteMapping(value = "/DeleteMessage/{idmes}")
	public String deleteMessage(@PathVariable Long idmes) {
		
		
		return messageServ.deletemessage(idmes);
	}

}
