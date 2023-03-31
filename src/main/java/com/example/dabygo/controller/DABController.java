package com.example.dabygo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.dabygo.entities.DAB;
import com.example.dabygo.service.DABService;

@RestController
@CrossOrigin
public class DABController {
	
	@Autowired
	DABService dabServ;
	@PostMapping(value = "/addDAB")
	public DAB addBAB(@RequestBody DAB dab) {
		
		return dabServ.addDAB(dab);
	}

}
