package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.bean.User;
import com.test.service.UserService;

@Controller
public class MyController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public void save(@RequestBody User user) {

		userService.save(user);

	}

}
