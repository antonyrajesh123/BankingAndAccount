package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Bean;

public interface CustomerService {
	/**
	 * Returns the {@link Customer} with the given id or {@literal null} if no {@link Customer} with the given id was
	 * found.
	 *
	 * @param id
	 * @return
	 */
	Optional<Customer> findById(Long id);

	/**
	 * Saves the given {@link Customer}.
	 *
	 * @param customer
	 * @return
	 */
	Customer save(Customer customer);

	/**
	 * Returns all customers.
	 *
	 * @return
	 */
	List<Customer> findAll();

	/**
	 * Returns the page of {@link Customer}s with the given index of the given size.
	 *
	 * @param page
	 * @param pageSize
	 * @return
	 */
	List<Customer> findAll(int page, int pageSize);

	/**
	 * Returns the page of {@link Customer}s with the given lastname and the given page index and page size.
	 *
	 * @param lastname
	 * @param page
	 * @param pageSize
	 * @return
	 */
	List<Customer> findByLastname(String lastname, int page, int pageSize);
}
