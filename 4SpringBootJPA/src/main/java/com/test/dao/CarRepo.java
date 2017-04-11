package com.test.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.test.bean.Cars;


public interface CarRepo extends MongoRepository<Cars, String>{

}
