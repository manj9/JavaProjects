package com.bean;

public interface CustomerDAO {
	
	public Customer selectCustomer(int customerId);
	
	public int insert(Customer c);
	
	public void updateCustomer(Customer customer);

}
