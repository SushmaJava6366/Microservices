package com.microservices.contact;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.microservices.contact.dao.ContactRepository;
import com.microservices.contact.entity.Contact;


@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
class ApplicationTests {
	
	@Autowired
	public ContactRepository contactrepo;

	@Test
	@Order(1)
	public void testCreateContact() {
		Contact contact=new Contact();
		contact.setContactId((long) 1);
		contact.setContactNum1("7846383638");
		contact.setContactNum2("6743362356");
		contact.setEmailId("sushma@gmail.com");

	}
	

	
}
