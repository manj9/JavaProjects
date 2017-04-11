package com.test.service;

import com.test.bean.Cars;

public interface ServiceInterface {

	public void insert(String vin,String carbrand,String carname,String carcolor,String carprice );
	public void save(Cars car);
	public Cars findByVin(String vin);
	public String delete(String vin);
	public void update(Cars car);
	
	}	

