package com.example.dabygo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dabygo.entities.DAB;
import com.example.dabygo.repository.DABRepository;

@Service
public class DABService implements IdabService{
	@Autowired
	DABRepository dabRep;

	@Override
	public DAB addDAB(DAB dab) {
		// TODO Auto-generated method stub
		return dabRep.save(dab);
	}

}
