package com.spring;

@Configuration
public class Config {

	@Bean(name="helloBean")
	public Hello hello(){
		
		return new Hello2();
	}
	
	
}
