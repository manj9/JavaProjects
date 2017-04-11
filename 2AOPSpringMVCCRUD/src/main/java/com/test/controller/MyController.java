package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.bean.Cars;
import com.test.service.Serviceimpl;

@Controller
public class MyController {

	@Autowired
	Serviceimpl serviceimpl;
	
   

	Cars car = new Cars();
	
	@RequestMapping(value = "/{vin}/{carbrand}/{carname}/{carcolor}/{carPrice}", method = RequestMethod.POST)
	public ResponseEntity<Cars> insert(@PathVariable("vin") String vin, @PathVariable("carbrand") String carbrand,
			@PathVariable("carname") String carname, @PathVariable("carcolor") String carcolor,
			@PathVariable("carPrice") String carprice) {

	        serviceimpl.insert(vin, carbrand, carname, carcolor, carprice);	
	 
		return new ResponseEntity<Cars>(HttpStatus.OK);
	}

	
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ResponseEntity<Cars> saveCar(@RequestBody Cars car ){
	
	   serviceimpl.save(car);
		
		
		return new ResponseEntity<Cars>(car,HttpStatus.OK);
	
	}
	public ResponseEntity<Cars> getCar(@PathVariable("vin") String vin) {

		serviceimpl.findByVin(vin);

		return new ResponseEntity<Cars>(car, HttpStatus.OK);
	}
    
	@RequestMapping(value="delete/{vin}", method=RequestMethod.DELETE)
	public ResponseEntity<Cars> deleteCar(@PathVariable("vin") String vin) {

		serviceimpl.delete(vin);
		return new ResponseEntity<Cars>(car, HttpStatus.OK);

	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ResponseEntity<Cars> update(@RequestBody Cars car){

		serviceimpl.update(car);
		return new ResponseEntity<Cars>(car,HttpStatus.OK);
	}
	
		
}