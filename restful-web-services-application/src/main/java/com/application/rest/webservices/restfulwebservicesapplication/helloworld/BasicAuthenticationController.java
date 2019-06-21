package com.application.rest.webservices.restfulwebservicesapplication.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BasicAuthenticationController {

	
	
	@GetMapping(path = "/basicauth")
	public AuthenticationBean helloWorldBean() {
		
		//throw new RuntimeException("Some Error has Happened ! Contact support at ***-***");
		return new AuthenticationBean("You are authenticated!");
	}
	
}


