package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	@GetMapping("/public/hello")
	public String publicEndpoint() {
		return "This is a public endpoint!";
	}

	@GetMapping("/private/hello")
	public String privateEndpoint() {
		return "You are authenticated User!";
	}

	@GetMapping("/private/hello-admin")
	public String privateEndpointAdmin() {
		return "You are authenticated Admin!";
	}
}
