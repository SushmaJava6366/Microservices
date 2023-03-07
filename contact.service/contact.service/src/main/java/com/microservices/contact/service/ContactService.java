package com.microservices.contact.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.contact.dao.ContactRepository;
import com.microservices.contact.entity.Contact;

@Service
public class ContactService {
	@Autowired
	private ContactRepository contactrepo;

	public Contact addContact(Contact contact) {
		return contactrepo.save(contact);

	}

	public Contact getContact(Long Id) {
		return contactrepo.findById(Id).get();

	}
	
	public Contact updateContact(Contact contact)
	{
		return contactrepo.save(contact);
		
	}

}
