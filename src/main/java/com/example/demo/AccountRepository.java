package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface AccountRepository extends JpaRepository<Account, Long> {
	List<Account> findByCustomer(Customer customer);
	Account findById(long id);
}
