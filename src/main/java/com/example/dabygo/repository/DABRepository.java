package com.example.dabygo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dabygo.entities.DAB;


@Repository
public interface DABRepository extends JpaRepository<DAB,Long> {

}
