package com.test.hijack;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Hijack {

	@Before("execution(* com.test.service.CarService.insert(..))")
	public void saved(){
		
		System.out.println("***************successfully inserted**************");
		
		
	}
	
	
}
