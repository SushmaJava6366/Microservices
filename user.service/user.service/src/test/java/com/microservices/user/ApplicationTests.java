package com.microservices.user;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.List;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


import com.microservices.user.entity.User;
import com.microservices.user.repository.UserRepository;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
class ApplicationTests {

	@Autowired
	public UserRepository userrepo;

	@Test
	@Order(1)
	public void testCreateUser() {
		User user = new User();
		user.setUserId((long) 1);
		user.setUserName("priya");
		user.setUserAddress("malur");
		user.setContactId((long) 1);
		
	}
	@Test
	@Order(2)
	public void testUpdate() {
		User user = userrepo.findById((long) 1).get();
		user.setUserAddress("kolar");
		userrepo.save(user);
		assertNotEquals("malur", userrepo.findById((long) 1).get().getUserAddress());
	}

}
