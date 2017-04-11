package com.test.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.test.bean.Person;

public class MyDatabase {

	JdbcTemplate jdbcTemplate;
	DataSource dataSource;
	//Person person;

	


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void insert(Person person) {

		String sql = "insert into studentdb values('" + person.getId() + "','" + person.getName() + "','"
				+ person.getCity() + "')";

		jdbcTemplate.execute(sql);

		System.out.println("it is executed");

	}

	public void delete(String id) {

		String sql = "delete from studentdb where id=?";
		jdbcTemplate.update(sql, new Object[] { Integer.valueOf(id) });

	}

	public void update(Person person) {
		String sql = "update studentdb set name ='" + person.getName() + "',city='" + person.getCity() + "' where id ='"
				+ person.getId() + "'";
		jdbcTemplate.update(sql);

	}

	public Person get(String id) {
		String sql = "select * from studentdb where id=?";
		Person person = jdbcTemplate.queryForObject(sql, new Object[] { new Integer(id) }, new PersonRowMapper());
		return person;

	}

	public List<Person> getAll() {
		String sql = "Select * from studentdb";
		List<Person> empList = jdbcTemplate.query(sql, new RowMapper<Person>() {

			public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
				Person p = new Person();
				p.setId(rs.getString("id"));
				p.setId(rs.getString("name"));
				p.setId(rs.getString("city"));
				return p;
			}
		});
		return empList;
	}

		/*public List<Person> findAll(){

			String sql = "SELECT * FROM CUSTOMER";

			List<Person> students  = jdbcTemplate.query(sql,new BeanPropertyRowMapper(Person.class));

			return students;
		}
		*/
	}
