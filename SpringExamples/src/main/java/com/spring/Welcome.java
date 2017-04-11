package com.spring;

public class Welcome {

	private String name;
	
	public void setName(String name){
		
		this.name = name;
	}
	public void printHi(){
		System.out.println("welcome to spring.."+name);
	}
}
