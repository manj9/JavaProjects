package com.coll;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Collections.xml");
		Customer cust = (Customer)context.getBean("Customer");
		System.out.println(cust);
		
	}

}
