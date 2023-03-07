package com.microservices.contact.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.contact.entity.Contact;
import com.microservices.contact.service.ContactService;

@RestController
@RequestMapping("/contacts")
public class ContactController {
	@Autowired
	private ContactService contactservice;

	@PostMapping("/")
	public Contact addContact(@Valid @RequestBody Contact contact) {
		return contactservice.addContact(contact);

	}

	@GetMapping("/{id}")
	public Contact getContact(@PathVariable("id") Long Id) {
		return contactservice.getContact(Id);

	}

	@PutMapping("/updatecontact")
	public Contact updateContact(@Valid @RequestBody Contact contact) {
		return contactservice.updateContact(contact);

	}

}
