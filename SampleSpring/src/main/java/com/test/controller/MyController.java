package com.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.bean.Person;

@Controller
public class MyController {

	List<Person> p = new ArrayList<Person>();

	@RequestMapping(value="/{id}")
	public ResponseEntity<Person> getPerson(@PathVariable("id") String id){
		
		Person p = new Person("123","mj","tx");
		
		
		return new ResponseEntity<Person>(p,HttpStatus.OK);
		
	}

	@RequestMapping(value="/{id}",method=  RequestMethod.DELETE)
	public ResponseEntity<Person> Delete(@PathVariable("id")String id){
		try{
			boolean p1 = p.remove(id);
			if(id!=null){
				
				return new ResponseEntity<Person>(HttpStatus.OK);
			}
			else{
				return new ResponseEntity<Person>(HttpStatus.NOT_FOUND);
			}
		}catch(Exception e){
			
		}
		return null;
	}
	public ResponseEntity<Person> AddPerson(@PathVariable("name") String name,@PathVariable("city") String city, @PathVariable("id") String id ){
		
		Person add = new Person(name,city,id);
		p.add(add);
		
		return new ResponseEntity<Person>(add,HttpStatus.OK);
		
		
	}
}
