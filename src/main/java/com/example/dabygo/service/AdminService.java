package com.example.dabygo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dabygo.entities.Adminstrateur;


import com.example.dabygo.repository.AdminRepository;


@Service
public class AdminService implements IAdminService {
	@Autowired
	AdminRepository adminRep;

	@Override
	public Adminstrateur AddAdmin(Adminstrateur adminstrateur) {
		// TODO Auto-generated method stub
		
		return adminRep.save(adminstrateur);
	}

	@Override
	public Adminstrateur updateAdmin(Adminstrateur adminstrateur, Long idadmin) {
		// TODO Auto-generated method stub
		Adminstrateur adm =  adminRep.findById(idadmin).get();
		adm.setFirstName(adminstrateur.getFirstName());
        adm.setLastName(adminstrateur.getLastName());
        adm.setEmail(adminstrateur.getEmail());
        adm.setLogin(adminstrateur.getLogin());
        adm.setPassword(adminstrateur.getPassword());
        adm.setConfirmpassword(adminstrateur.getConfirmpassword());
		return adminRep.save(adm) ;
	}

	@Override
	public String deleteAdmin(Long idadmin) {
		// TODO Auto-generated method stub
		String ch="";
		if(adminRep.existsById(idadmin)) {
			adminRep.deleteById(idadmin);
			ch="adminstrateur deleted successfuly";
		}
		else
		{
			ch="adminstrateur doesn't exist";
		}
		return ch;
	}

	@Override
	public List<Adminstrateur> findallAdminstrateur() {
		// TODO Auto-generated method stub
		return adminRep.findAll();
	}

	@Override
	public Adminstrateur findadminbyid(Long idadmin) {
		String ch="not found";
		
		  Optional<Adminstrateur> admin = adminRep.findById(idadmin);
	        if (admin.isPresent()) {
	            return admin.get();
	        }
			return null;
			
	}



}
