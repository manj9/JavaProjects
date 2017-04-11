package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.bean.Cars;
import com.test.dao.Dao;

@Service
public class Serviceimpl implements ServiceInterface {
	@Autowired
	Dao dao;

	public void setDao(Dao dao) {
		this.dao = dao;
	}

	Cars car = new Cars();

	public void save(Cars car) {

		dao.insert(car);

	}

	public void insert(String vin, String carbrand, String carname, String carcolor, String carprice) {

		Cars car = new Cars();
		car.setVin(vin);
		car.setCarbrand(carbrand);
		car.setCarname(carname);
		car.setCarcolor(carcolor);
		car.setCarprice(carprice);
		dao.insert(car);
	}

	public Cars findByVin(String vin) {

		dao.findById(vin);

		return car;
	}

	public String delete(String vin) {

		if (vin != null) {
			dao.delete(vin);

		} else {

			return ("not found ");
		}
		return null;
	}

	public void update(Cars car) {

		dao.update(car);
	}
}
