package com.test.bean;

public class Person {

	String name;
	String city;
	String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	public Person(String name,String city, String id) {
		super();
		this.name = name;
		this.city = city;
		this.id = id;
	}
	
	
	}

