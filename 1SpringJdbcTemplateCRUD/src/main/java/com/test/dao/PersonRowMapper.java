package com.test.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.test.bean.Person;

public class PersonRowMapper implements RowMapper<Person> {

	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {

	Person p = new Person();
	p.setId(rs.getString("id"));
	p.setCity(rs.getString("name"));
	p.setName(rs.getString("city"));
	return p;
	
	}

}
