package com.microservices.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.user.VO.ResponseTemplateVO;
import com.microservices.user.entity.User;
import com.microservices.user.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userservice;

	@PostMapping("/adduser")
	public User addUser(@RequestBody User user) {
		return userservice.addUser(user);

	}

	@GetMapping("/{id}")
	public ResponseTemplateVO getUserWithContact(@PathVariable("id") Long userId) {

		return userservice.getUserWithContact(userId);
	}

}
