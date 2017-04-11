package com.test;

public class ThisExample {

	String name;
	String id;

	public ThisExample(String name, String id) {

		this.name = name;
		this.id = id;
	}

	public void method(){
		
		System.out.println("hello"+name+"   "+id);
		
	}
	
 public static void main(String[] args) {
	
	 ThisExample t = new ThisExample("mj","12");
	 t.method();
	 
	 
}


}
