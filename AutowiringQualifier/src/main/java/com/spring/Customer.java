package com.spring;

import org.springframework.stereotype.Component;

@Component
public class Customer {

	String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + "]";
	}
	
	
	
	
}
