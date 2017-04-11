package com.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Statement {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "tiger");

			java.sql.Statement stm = con.createStatement();
			//String query1 = "create table Emp(Name varchar(50), City varchar(20))";
			String query2 = "insert into Student values('manoj','Dallas')";
			String query3 = "insert into Student values('mj','Texas')";
			String query4 = "select * from Emp";

			//stm.execute(query1);
			// int no_of_rows = 0;
			//stm.execute(query1);
			stm.execute(query2);
			stm.execute(query3);
			ResultSet rs = stm.executeQuery(query4);

			System.out.println(rs);
			/*
			 * while(rs.next()){ no_of_rows++; }
			 * System.out.println("NO.of rows before commit statement:"
			 * +no_of_rows); con.setAutoCommit(false); stm.execute(query2);
			 * stm.execute(query3); con.commit(); rs = stm.executeQuery(query4);
			 * no_of_rows = 0;
			 * 
			 * while(rs.next()){ no_of_rows++;
			 * 
			 * } System.out.println("no of rows after commit statement:"
			 * +no_of_rows);
			 * 
			 */
			con.close();
		} catch (SQLException e) {
			System.out.println(e);
		
		}
	}
}
