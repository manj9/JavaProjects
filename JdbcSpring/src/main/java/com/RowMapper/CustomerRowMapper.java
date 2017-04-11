package com.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.App.Customer;

public class CustomerRowMapper implements RowMapper{

	public Object mapRow(ResultSet rs, int rowNum) throws SQLException{
		
		Customer customer = new Customer();
		customer.setCustId(rs.getInt(0));
		customer.setName(rs.getString(1));
		customer.setAge(rs.getInt(2));
		return customer;
		
	}

}
