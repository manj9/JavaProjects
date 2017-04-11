package com.test.dao;

import com.test.bean.Cars;

public interface DaoInterface {

	public void insert(Cars car);
	
	public Cars findById(String vin);
	public void delete(String vin);
	public void update(Cars car);
}

