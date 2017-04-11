package com.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Statement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "tiger");

			Statement stm = con.createStatement();
			String query2 = "insert into Emp values('manoj','Dallas')";
			String query3 = "insert into Emp values('mj','Texas')";
			String q3 = "select * from Emp";

			stm.executeQuery(query2);
			stm.execute(query3);
			ResultSet r = stm.executeQuery(q3);
			r = stm.executeQuery(query3);
			r = stm.executeQuery(q3);

			while (r.next()) {

				System.out.println(r.getString(1) + "" + r.getString(2));

			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
