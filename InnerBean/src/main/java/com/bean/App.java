package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("mkyongref.xml");
		Customer cst = (Customer) context.getBean("CustomerBean");
		System.out.println(cst);

	}

}
