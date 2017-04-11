package com.bean;

public class Customer {
	
	Person person;
	
//	public Customer(Person person){
//		
//		this.person=person;
//		
//	}
	public void setPerson(Person person){
		this.person=person;
		
	}
	@Override
	public String toString() {
		return "Customer [person=" + person + "]";
	}
	

}
