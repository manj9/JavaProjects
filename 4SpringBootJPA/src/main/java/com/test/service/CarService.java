package com.test.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.bean.Cars;
import com.test.dao.CarRepo;

@Service
public class CarService {

	@Autowired
	CarRepo carRepoImpl;
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());


	
	public void setCarRepoImpl(CarRepo carRepoImpl) {
		this.carRepoImpl = carRepoImpl;
	}

	public void insert(Cars car) {

		logger.info("******insert method********");
		carRepoImpl.save(car);

	}
	public void delete(String vin) {
		logger.info("******delete method********");
		carRepoImpl.delete(vin);
	}

	public Cars get(String vin) {
		logger.info("******get method********");
		return carRepoImpl.findOne(vin);

	}

	public List<Cars> getall() {
		logger.info("******getall method********");
		
		List<Cars> cars = carRepoImpl.findAll();
		
		return cars;
	
	}

	public void deleteAll(){
		logger.info("******deletall method********");
		carRepoImpl.deleteAll();
	
	}
	

	

}
