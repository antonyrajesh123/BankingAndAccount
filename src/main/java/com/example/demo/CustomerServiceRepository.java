package com.example.demo;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerServiceRepository{
	
	@PersistenceContext
	  private EntityManager em;

	  @Autowired
	  private CustomerRepository repository;

	public Optional<Customer> findById(Long id) {
		   return repository.findById(id);
	}

	public Customer save(Customer customer) {
		return repository.save(customer);
	}

	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public List<Customer> findAll(int page, int pageSize) {
	    TypedQuery query = em.createQuery("select c from Customer c", Customer.class);

	    query.setFirstResult(page * pageSize);
	    query.setMaxResults(pageSize);

	    return query.getResultList();
	}

	public List<Customer> findByLastname(String lastname, int page, int pageSize) {
	    TypedQuery query = em.createQuery("select c from Customer c where c.lastname = ?1", Customer.class);

	    query.setParameter(1, lastname);
	    query.setFirstResult(page * pageSize);
	    query.setMaxResults(pageSize);

	    return query.getResultList();
	}


	



}
