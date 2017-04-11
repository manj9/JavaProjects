package com.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Prototype.xml");
		Customer cst1 = (Customer)context.getBean("customer");
		cst1.setMessage("hey.....");
		System.out.println(cst1.getMessage());
		
		Customer cst2 = (Customer) context.getBean("customer");
		System.out.println(cst2.getMessage());
		
	}

}
