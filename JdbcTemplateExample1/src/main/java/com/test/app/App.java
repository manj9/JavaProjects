package com.test.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.bean.BeanClass;
import com.test.dao.EmpDao;

public class App {

	public static void main(String[] args) {

	    ApplicationContext ctx=new ClassPathXmlApplicationContext("Bean.xml");  
        EmpDao dao = (EmpDao)ctx.getBean("Empdao");
        int status = dao.saveEmp(new BeanClass("mj","tx"));
        System.out.println(status);
        
	    
	}

}
