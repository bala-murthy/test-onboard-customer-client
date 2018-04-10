package com.bala.tf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class TestOnboardCustomerClientApplication {
	
	//private static final Logger log = LoggerFactory.getLogger(TestOnboardCustomerClientApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TestOnboardCustomerClientApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	/*@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			User user= restTemplate.getForObject(
					"http://localhost:8080/getuserdetails/161989", User.class);
			         log.info(user.toString());
		};
	}*/
}
