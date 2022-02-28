package com.apirest.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebfluxProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebfluxProjectApplication.class, args);
		System.out.println("Ola mundo com webflux!!! ");
	}

}
