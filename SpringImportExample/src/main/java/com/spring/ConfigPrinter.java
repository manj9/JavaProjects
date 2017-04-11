package com.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({Printer1.class,Printer2.class})
public class ConfigPrinter {
	

}
