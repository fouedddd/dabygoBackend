package com.example.dabygo.service;


import com.example.dabygo.entities.Adminstrateur;
import com.example.dabygo.entities.DAB;

import java.util.List;
import java.util.Optional;

public interface IdabService {
	
	
	public DAB addDAB(DAB dab);
	public DAB updatDAB(DAB dab, Long iddab);
	public String deletedab(Long iddab);
	public List<DAB> findallDAB();
	public DAB finddabbyid(Long iddab);
	

}
