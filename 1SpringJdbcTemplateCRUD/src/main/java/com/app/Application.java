package com.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.bean.Person;
import com.test.dao.MyDatabase;

public class Application {

	public static void main(String[] args) {
		
	
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
	MyDatabase db = (MyDatabase)ctx.getBean("dao");
   
    db.delete("2");
	//db.update(new Person("2","mj","tx"));
	}
	}

