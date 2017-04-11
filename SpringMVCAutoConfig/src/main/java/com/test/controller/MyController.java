package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.beans.Person;
import com.test.service.ServiceImpl;

@Controller
public class MyController {
	
	@Autowired
	ServiceImpl serviceImpl;

	@RequestMapping(value=("/{id} "), method = RequestMethod.GET)
	public ResponseEntity<Person> getPerson(@PathVariable("id") String id) {
		Person p = new Person();
		Person per = serviceImpl.getPerson(p);
		per.setPersonID(id);
		return new ResponseEntity<Person>(p, HttpStatus.OK);

	}

}
