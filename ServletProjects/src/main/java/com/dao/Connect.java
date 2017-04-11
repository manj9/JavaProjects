package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.biz.Student;


public class Connect {

	public void conn(Student emp) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "tiger");
			PreparedStatement pst = con.prepareStatement("insert into Tekgroup values(?,?,?,?,?,?,?)");
			pst.setString(1, emp.getName());
			pst.setString(2, emp.getTool());
			pst.setString(3, emp.getPhone());
			pst.setString(4, emp.getSex());
			pst.setString(5, emp.getAddress());
			pst.setString(6, emp.getState());
			pst.setString(7, emp.getCountry());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
