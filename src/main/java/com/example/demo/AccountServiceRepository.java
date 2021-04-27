package com.example.demo;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountServiceRepository{
	
	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	private AccountRepository accountRepository;

	@Transactional
	public Account save(Account account) {
		return accountRepository.save(account);
	}

	public List<Account> findByCustomer(Customer customer) {
		return accountRepository.findByCustomer(customer);
	}
	
	public Account findById(long id) {
		return accountRepository.findById(id);
	}

}
