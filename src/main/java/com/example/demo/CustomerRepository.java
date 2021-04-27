package com.example.demo;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Page<Customer> findByLastname(String lastname, Pageable pageable); 
}