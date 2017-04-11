package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigPrinter2 {

	@Bean(name = "Printer2")
	public Printer2 print2() {

		return new Printer2();
	}

}
