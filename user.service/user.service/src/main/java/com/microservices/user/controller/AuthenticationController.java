package com.microservices.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.user.entity.User;
import com.microservices.user.jwt.JwtUtils;
import com.microservices.user.security.UserLoginDetails;
import com.microservices.user.security.UserLoginDetailsService;
import com.microservices.user.service.UserService;

@RestController
@RequestMapping(value = "/user/auth")
public class AuthenticationController {
	@Autowired
	private UserLoginDetailsService userLoginDetailsService;
	
	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtUtils jwtUtils;
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping(value = "/authentication")
	public ResponseEntity<String> authenticated(@RequestBody User user) {
		
		Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUserName(), user.getUserPassword()));
		
		if(authentication.isAuthenticated()) {
			UserLoginDetails userLoginDetails = (UserLoginDetails) userLoginDetailsService.loadUserByUsername(user.getUserName());
			String token = jwtUtils.generateJwtToken(userLoginDetails);
			return ResponseEntity.ok(token);
		}
		
		return ResponseEntity.ok(userService.notAutherizedMessage());
		
	}
	

}
