package com.example.dabygo.controller;

import com.example.dabygo.entities.Adminstrateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.example.dabygo.entities.DAB;
import com.example.dabygo.service.DABService;

import java.util.List;

@RestController
@CrossOrigin
public class DABController {
	
	@Autowired
	DABService dabServ;
	@PostMapping(value = "/addDAB")
	public DAB addBAB(@RequestBody DAB dab) {
		
		return dabServ.addDAB(dab);
	}

	@PutMapping(value = "/updateDAB/{iddab}")
	public DAB updateDAB(@RequestBody DAB dab, @PathVariable Long iddab) {


		return dabServ.updatDAB(dab,iddab);
	}
	@DeleteMapping(value = "/DeleteDAB/{iddab}")
	public String deleteDAB(@PathVariable Long iddab) {


		return dabServ.deletedab(iddab);
	}

	@GetMapping(value = "/GetAllDAB")
	public List<DAB> GetAllAdmin() {


		return dabServ.findallDAB();
	}

	@GetMapping(value = "/GetDAB/{iddab}")
	public DAB GetAdmin( @PathVariable Long iddab) {


		return dabServ.finddabbyid(iddab);
	}

}
