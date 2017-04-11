package com.test.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.test.bean.Cars;

@Component
public class Dao implements DaoInterface {

	JdbcTemplate jdbcTemplate;
	@Autowired
	DataSource dataSource;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	public void insert(Cars car) {

		String sql = "INSERT INTO mydb.carshowroom VALUES (?, ?, ?, ?, ?)";
		// jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql, car.getVin(), car.getCarbrand(), car.getCarname(), car.getCarcolor(),
				car.getCarprice());
	}

	public Cars findById(String vin) {

		String sql = "select * from mydb.carshowroom where vin = ?";
		Cars car = jdbcTemplate.queryForObject(sql, new Object[] { new Integer(vin) }, new CarsRowMapper());
		return car;

	}

	public void delete(String vin) {

		String sql = "delete from mydb.carshowroom where vin='"+vin+"'";
		jdbcTemplate.execute(sql);
	}
    
	public void update(Cars car){
		
		String sql ="update mydb.carshowroom set carbrand='"+car.getCarbrand()+"',carname='"+car.getCarname()+"',carcolor='"+car.getCarcolor()+"',carprice='"+car.getCarprice()+"' where vin='"+car.getVin()+"'";
		jdbcTemplate.update(sql);	
		
	}
}
