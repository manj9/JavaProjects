package com.beans;

public class Customer {
	
	String name;
	String city;
	String state;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
		
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public void display(){
		
		System.out.println(name+"   "+city+"    "+state);
	}
	

}
