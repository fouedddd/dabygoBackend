package com.example.dabygo.service;

import java.util.List;

import com.example.dabygo.entities.Adminstrateur;


public interface IAdminService {
	public Adminstrateur AddAdmin(Adminstrateur adminstrateur);
	public Adminstrateur updateAdmin(Adminstrateur adminstrateur, Long idadmin);
	public String deleteAdmin(Long idadmin);
	   public List<Adminstrateur> findallAdminstrateur();
	   public Adminstrateur findadminbyid(Long idadmin);

}
