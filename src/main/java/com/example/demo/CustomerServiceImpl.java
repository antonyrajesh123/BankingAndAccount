package com.example.demo;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CustomerServiceImpl implements CustomerService{
	


	  @Autowired
	  private CustomerServiceRepository customerServiceRepository;

	public Optional<Customer> findById(Long id) {
		   return customerServiceRepository.findById(id);
	}

	public Customer save(Customer customer) {
		return customerServiceRepository.save(customer);
	}

	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return customerServiceRepository.findAll();
	}

	public List<Customer> findAll(int page, int pageSize) {
		return customerServiceRepository.findAll();
	}

	public List<Customer> findByLastname(String lastname, int page, int pageSize) {
		return customerServiceRepository.findByLastname(lastname, page, pageSize);
	}


	



}
