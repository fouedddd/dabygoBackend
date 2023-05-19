package com.example.dabygo.service;

import com.example.dabygo.entities.Adminstrateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dabygo.entities.DAB;
import com.example.dabygo.repository.DABRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DABService implements IdabService{
	@Autowired
	DABRepository dabRep;

	@Override
	public DAB addDAB(DAB dab) {
		// TODO Auto-generated method stub
		return dabRep.save(dab);
	}

	@Override
	public DAB updatDAB(DAB dab, Long iddab) {
		DAB db =  dabRep.findById(iddab).get();
		db.setBanque(dab.getBanque());
		db.setLongitude(dab.getLongitude());
		db.setLatitude(dab.getLatitude());
		db.setPlafon_max(dab.getPlafon_max());
		db.setEtat(dab.getEtat());
		return dabRep.save(db) ;
	}

	@Override
	public String deletedab(Long iddab) {
		String ch="";
		if(dabRep.existsById(iddab)) {
			dabRep.deleteById(iddab);
			ch="DAB deleted successfuly";
		}
		else
		{
			ch="DAB doesn't exist";
		}
		return ch;
	}

	@Override
	public List<DAB> findallDAB() {
		return dabRep.findAll();
	}

	@Override
	public DAB finddabbyid(Long iddab) {
		String ch="not found";

		Optional<DAB> dab = dabRep.findById(iddab);
		if (dab.isPresent()) {
			return dab.get();
		}
		return null;
	}




}
