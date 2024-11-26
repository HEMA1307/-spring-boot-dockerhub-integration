package com.example.spring_boot_dockerhub_integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerhubIntegrationApplication {

	@GetMapping("/message")
	public String display() {
		return "Application started";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerhubIntegrationApplication.class, args);
	}

}
