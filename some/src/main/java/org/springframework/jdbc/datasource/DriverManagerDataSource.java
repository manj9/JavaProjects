package org.springframework.jdbc.datasource;

import com.sql.jdbc.Driver;

public class DriverManagerDataSource {
	
	Driver driverClassName;
	Object url;
	Object username;
	Object password;
	public Driver getDriverClassName() {
		return driverClassName;
	}
	public void setDriverClassName(Driver driverClassName) {
		this.driverClassName = driverClassName;
	}
	public Object getUrl() {
		return url;
	}
	public void setUrl(Object url) {
		this.url = url;
	}
	public Object getUsername() {
		return username;
	}
	public void setUsername(Object username) {
		this.username = username;
	}
	public Object getPassword() {
		return password;
	}
	public void setPassword(Object password) {
		this.password = password;
	}

}
