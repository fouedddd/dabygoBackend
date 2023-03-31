package com.example.dabygo.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

	
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	
	@Entity
	public class Adminstrateur implements Serializable{
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long idadmin;
		private String firstName;
		private String lastName;
		private String email;
		private String login;
		private String password;
		private String confirmpassword;

}
