package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigPrinter.class);
		
		Printer1 print = (Printer1) context.getBean("Printer1");
		print.print("mj");
		
		Printer2 printt = (Printer2)context.getBean("Printer2");
		printt.print("manoj");
		
		
		
	}

}
