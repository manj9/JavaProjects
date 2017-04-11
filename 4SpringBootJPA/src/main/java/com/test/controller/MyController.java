package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.bean.Cars;
import com.test.service.CarService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/v1/cars")
@Api(value="carshowroom", description="crud operations for Cars")
public class MyController {

	@Autowired
	CarService carService;

	@ApiOperation(value = "Add a Car")
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public ResponseEntity<Cars> insert( @RequestBody Cars car) {
		carService.insert(car);

		return new ResponseEntity<Cars>(HttpStatus.OK);
	}
    @ApiOperation(value= "delete a car")
	@RequestMapping(value="/delete",method = RequestMethod.POST)
	public void delete(String id){
		
		carService.delete(id);
	}
	@ApiOperation(value="get a particular car by its vin")
	@RequestMapping(value = "/get{vin}", method = RequestMethod.GET)
	public Cars get(@PathVariable("vin")String vin){
		Cars car = carService.get(vin);
		return car;
		
	}
	@ApiOperation(value="getall cars")
	@RequestMapping(value = "/getall", method = RequestMethod.GET)
	public List<Cars> getall(){
		
		List<Cars> cars = carService.getall();
		
		return cars;
	}
	@ApiOperation(value="delete all cars")
	@RequestMapping(value = "/deleteall", method = RequestMethod.POST)
	public void deleteall(){
		
		carService.deleteAll();
	}
}
