package com.helper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext con = new ClassPathXmlApplicationContext(new String[] {"bean.xml"});
		
        InOutHelper io = (InOutHelper)con.getBean("loosely"); 
        io.getOutput();
        
		
	}

}
