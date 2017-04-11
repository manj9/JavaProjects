package com.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@RequestMapping(value="/dosomething" ,method=RequestMethod.GET)
	public String doSomeThing()
	{
		return "messsage from StudentController";
	}
}
