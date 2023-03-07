package com.microservices.contact.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.contact.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact,Long>{

}
