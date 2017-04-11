package com.test.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.test.bean.BeanClass;

public class EmpDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate=jdbcTemplate;
	}
    public int saveEmp(BeanClass e){
    	
    	String query="insert into emp values('"+e.getCity()+"','"+e.getName()+"')";
         
    	return jdbcTemplate.update(query);
    }
    
    public int updateEmp(BeanClass e){
    	
    	String sql = "update emp set name=('"+e.getName()+"','"+e.getCity()+"')";
    	
    	return jdbcTemplate.update(sql);
    }
    public int deleteEmp(BeanClass e){
    	String sql ="delete from emp where id="+e.getName()+"";
    	return jdbcTemplate.update(sql);
    	
    }
}
