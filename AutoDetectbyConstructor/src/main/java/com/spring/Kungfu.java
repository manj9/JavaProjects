package com.spring;

public class Kungfu {
	
	Panda name;
	
	public Kungfu(Panda name){
		
		System.out.println("autowiring by constructor");
		this.name = name;
	}

	public Panda getName() {
		return name;
	}

	public void setName(Panda name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Kungfu [name=" + name + "]";
	}
	

	
}
