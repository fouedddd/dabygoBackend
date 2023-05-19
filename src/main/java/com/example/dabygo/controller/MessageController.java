package com.example.dabygo.controller;

import com.example.dabygo.entities.Adminstrateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.dabygo.entities.Message;
import com.example.dabygo.service.MessageService;

import java.util.List;

@RestController
@CrossOrigin
public class MessageController {

	@Autowired
	MessageService messageServ;


	@PostMapping(value = "/addMessage")
	public Message addMessage(@RequestBody Message mes)  {

		return messageServ.Addmessage(mes);
	}

	@DeleteMapping(value = "/DeleteMessage/{idmes}")
	public String deleteMessage(@PathVariable Long idmes) {


		return messageServ.deletemessage(idmes);
	}

	@GetMapping(value = "/GetAllmessage")
	public List<Message> GetAllMessage() {
		return messageServ.findallMessage();
	}

}
