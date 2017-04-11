package com.test.bean;

public class BeanClass {
	
	String name;
	String city;
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
	public BeanClass(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	

}
