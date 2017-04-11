package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean(name="helloBean")
	public Hello hello(){
		
		return new PrintHello();
	}
	

}
