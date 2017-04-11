package com.DBconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Conn {

	public static void main(String args[]) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// loading the driver class
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "tiger");
			// String s1 ="insert into mjmanu values('manoj')";
			// Statement stmt = con.createStatement();
			PreparedStatement ps = con.prepareStatement("insert into mjmanu values(?)");
			ps.setString(1, "Manoj anna");
			ResultSet rs = ps.executeQuery();
			// ResultSet rs = stmt.executeQuery(s1);

			// while(rs.next())
			// System.out.println( rs.getString(1));

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
