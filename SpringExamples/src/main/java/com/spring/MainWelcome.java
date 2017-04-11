package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainWelcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ApplicationContext context = new ClassPathXmlApplicationContext("Welcome.xml");		
	
    Welcome w = (Welcome) context.getBean("mk");
    w.printHi();
	}

}
