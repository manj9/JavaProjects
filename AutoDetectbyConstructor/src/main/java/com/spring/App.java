package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	    Kungfu name = (Kungfu)context.getBean("kungfu");
	    System.out.println(name.toString());
		
		
	}

}
