package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.biz.Student;

public class Connect {
	Connection con = null;
	public void conn(Student std) {
		try {
			getConnection();
			PreparedStatement pst = con.prepareStatement("insert into Tekgroup values(?,?,?,?,?,?,?)");
			pst.setString(1, std.getName());
			pst.setString(2, std.getTool());
			pst.setString(3, std.getPhone());
			pst.setString(4, std.getSex());
			pst.setString(5, std.getAddress());
			pst.setString(6, std.getState());
			pst.setString(7, std.getCountry());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	private Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "tiger");
		return con;
	}
}

