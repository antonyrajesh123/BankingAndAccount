package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	/*@Bean
	public CustomerService getCustomerService() {
		return new CustomerServiceImpl();
	}

	@Bean
	public AccountService getAccountService() {
		return new AccountServiceImpl();
	}*/
}
