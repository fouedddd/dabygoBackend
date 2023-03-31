package com.example.dabygo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dabygo.entities.Adminstrateur;


@Repository
public interface AdminRepository extends JpaRepository<Adminstrateur, Long>{

}
