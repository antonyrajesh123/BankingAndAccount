package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
	
	@Autowired
	private AccountService accountService;
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping(value="/customers")
	public List<Customer> listCustomers() {
		return customerService.findAll();
	}

	@PostMapping(value="/accounts")
	public Account saveAccount(@RequestBody Account account) {
		return accountService.save(account);
	}
	
	@PostMapping(value="/accounts/credit")
	public Account credit(@RequestBody Account account) {
		return accountService.save(account);
	}
	
	@PostMapping(value="/accounts/debit")
	public Account debit(@RequestBody Account account) {
		return accountService.save(account);
	}
	
	@PostMapping(value="/accounts/balance")
	public Account balance(@RequestBody Account account) {
		return accountService.save(account);
	}
}
