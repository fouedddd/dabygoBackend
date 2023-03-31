package com.example.dabygo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dabygo.entities.Client;


@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
