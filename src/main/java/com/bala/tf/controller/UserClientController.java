package com.bala.tf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bala.tf.model.User;

@RestController
public class UserClientController {
	
	@Autowired
	private RestTemplate restTemplate;
	//RestTemplate restTemplate = new RestTemplate();
	
/*	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}*/
	
	@GetMapping("/getuserclient")
	public User getUser() {		
		return restTemplate.getForObject("http://localhost:8080/getuserdetails/1989569", User.class);
		
	}

}
