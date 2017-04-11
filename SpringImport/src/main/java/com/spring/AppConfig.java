package com.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ConfigPrinter1.class,ConfigPrinter2.class})

public class AppConfig {
	
	
}
