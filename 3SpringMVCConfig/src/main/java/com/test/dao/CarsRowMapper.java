package com.test.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.test.bean.Cars;

public class CarsRowMapper implements RowMapper<Cars> {

	public Cars mapRow(ResultSet arg0, int arg1) throws SQLException {
	
		Cars car = new Cars();
		car.setVin("vin");
		car.setCarbrand("carbrand");
		car.setCarname("carname");
		car.setCarcolor("carcolor");
		car.setCarprice("carprice");
		return car;
	}

}
