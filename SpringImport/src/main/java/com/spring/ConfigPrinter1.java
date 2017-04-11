package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigPrinter1 {

	@Bean(name = "Printer1")
	public Printer1 print1() {

		return new Printer1();
	}

}
