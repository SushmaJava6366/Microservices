package com.microservices.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
	 @GetMapping("/userServiceFallBack")
	    public String userServiceFallBackMethod() {
	        return "User Service is taking longer than Expected." +
	                " Please try again later";
	    }

	    @GetMapping("/contactServiceFallBack")
	    public String contactServiceFallBackMethod() {
	        return "Contact Service is taking longer than Expected." +
	                " Please try again later";
	    }

}
