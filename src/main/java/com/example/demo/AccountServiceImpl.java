package com.example.demo;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService{
	
	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	private AccountServiceRepository accountServiceRepository;

	@Transactional
	public Account save(Account account) {
		return accountServiceRepository.save(account);
	}

	public List<Account> findByCustomer(Customer customer) {
		return accountServiceRepository.findByCustomer(customer);
	}

	public Account findById(long id) {
		return accountServiceRepository.findById(id);
	}
	
	public void credit(long id, int amount) {
		Account account=findById(id);
		int balance = account.getBalance();
		account.setBalance(balance+amount);
		
		accountServiceRepository.save(account);
		
	}

	public void debit(long id, int amount) {
		Account account=findById(id);
		int balance = account.getBalance();
		account.setBalance(balance-amount);
		
		accountServiceRepository.save(account);
	}

	public int balance(long id) {
		Account account=findById(id);
		return account.getBalance();
	}




}
