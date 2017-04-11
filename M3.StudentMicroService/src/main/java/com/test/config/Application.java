package com.test.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.test")
@EnableEurekaClient
public class Application {

	public static void main(String[] args) {
		System.setProperty("spring.config.name","student-service");
		SpringApplication.run(Application.class, args);

	}

}
