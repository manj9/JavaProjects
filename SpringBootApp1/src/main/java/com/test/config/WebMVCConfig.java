package com.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Configuration
/*@EnableWebMvc
@ComponentScan("com.test")*/
public class WebMVCConfig extends WebMvcConfigurerAdapter{

public InternalResourceViewResolver viewResover(){
	InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	resolver.setPrefix("src/main/resources");
	resolver.setSuffix(".jsp");
	return resolver;
	
}
}
