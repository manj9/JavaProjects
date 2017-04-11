package com.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.beans.Employee;

@Controller
public class App {

	Map<String, Employee> empmap = new HashMap<String, Employee>();

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Employee> getEmp(@PathVariable("id") String empID) {
		System.out.println("getEMP");
		Employee emp = empmap.get(empID);
		if (empID != null) {

			return new ResponseEntity<Employee>(emp, HttpStatus.OK);

		} else

			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
	}

	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public ResponseEntity<Employee> Insert() {

		Employee e = new Employee("manoj", "123", "TX");
		empmap.put(e.getId(), e);
		System.out.println(empmap);
		return new ResponseEntity<Employee>(e, HttpStatus.OK);
	}
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Employee> save(@RequestBody Employee emp) {
		System.out.println("save called...");
		System.out.println(emp);
		empmap.put(emp.getId(), emp);
		return new ResponseEntity<Employee>(emp, HttpStatus.CREATED);
	}
}
