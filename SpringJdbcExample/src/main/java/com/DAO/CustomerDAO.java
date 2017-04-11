package com.DAO;

import com.spring.Customer;

public interface CustomerDAO {

	public void insert(Customer customer);
	public Customer findByCustomerId(int custId);
	
}
