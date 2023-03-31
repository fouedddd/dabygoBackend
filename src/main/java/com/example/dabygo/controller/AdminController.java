package com.example.dabygo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dabygo.entities.Adminstrateur;
import com.example.dabygo.service.AdminService;


@RestController
@CrossOrigin
public class AdminController {
	@Autowired
	AdminService adminServ;
	
	
	@PostMapping(value = "/addAdmin")
	public Adminstrateur addAdmin(@RequestBody Adminstrateur adm) {
		
		return adminServ.AddAdmin(adm);
	}
	
	@PutMapping(value = "/updateAdmin/{idadmin}")
	public Adminstrateur updateadmin(@RequestBody Adminstrateur adm,@PathVariable Long idadmin) {
		
		
		return adminServ.updateAdmin(adm, idadmin);
	}
	
	@DeleteMapping(value = "/DeleteAdmin/{idadmin}")
	public String deleteAdmin(@PathVariable Long idadmin) {
		
		
		return adminServ.deleteAdmin( idadmin);
	}
	@GetMapping(value = "/GetAlladmin")
	public List<Adminstrateur> GetAllAdmin() {
		
		
		return adminServ.findallAdminstrateur();
	}
	@GetMapping(value = "/Getadmin/{idadmin}")
	public Adminstrateur GetAdmin( @PathVariable Long idadmin) {
		
		
		return adminServ.findadminbyid(idadmin);
	}

}
