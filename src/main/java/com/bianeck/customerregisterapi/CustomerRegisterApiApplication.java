package com.bianeck.customerregisterapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerRegisterApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CustomerRegisterApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Teste");
	}
}
