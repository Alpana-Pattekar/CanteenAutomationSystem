package com.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Canteen API", version = "2.0", description = "Canteen Information"))
public class CanteenAutomationSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CanteenAutomationSystemApplication.class, args);
	}

}
