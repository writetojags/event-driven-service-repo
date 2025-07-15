package com.example.microservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Added HealtCheck
@RestController
public class HealthCheckController {
	@GetMapping("/health")
	public String health() {
		return "OK";
		
	}

}
