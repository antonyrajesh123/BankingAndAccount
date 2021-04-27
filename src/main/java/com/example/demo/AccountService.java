package com.example.demo;

import java.util.List;

public interface AccountService {
	
	Account save(Account account);
	
	List<Account> findByCustomer(Customer customer);

	void credit(long id, int amount);
	
	void debit(long id, int amount);
	
	int balance(long id);
}
