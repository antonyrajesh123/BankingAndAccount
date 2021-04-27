package com.example.demo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Account {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @ManyToOne(cascade = {CascadeType.ALL})
  private Customer customer;
  
  private String accountType;
  
  private String branch;
  
  public int getBalance() {
	return balance;
}

public void setBalance(int balance) {
	this.balance = balance;
}

private int balance;

  public String getAccountType() {
	return accountType;
}

public void setAccountType(String accountType) {
	this.accountType = accountType;
}

public String getBranch() {
	return branch;
}

public void setBranch(String branch) {
	this.branch = branch;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public Customer getCustomer() {
	return customer;
}

public void setCustomer(Customer customer) {
	this.customer = customer;
}




}
