package com.example.dabygo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dabygo.entities.Message;

public interface messageRepository extends JpaRepository<Message,Long>{

}
