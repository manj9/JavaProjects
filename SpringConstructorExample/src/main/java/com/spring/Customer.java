package com.spring;

public class Customer {
	
	private String name,address;
	private int age;
	
	public Customer(String name,String address, int age){
		
		this.name=name;
		this.address=address;
		this.age=age;
	}   
	public Customer(String name,int age, String address){
		this.name=name;
		this.age=age;
		this.address=address;
	}

	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", age=" + age + "]";
	}

	
}

