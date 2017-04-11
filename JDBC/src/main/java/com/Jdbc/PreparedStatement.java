package com.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class PreparedStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "tiger");
			//java.sql.PreparedStatement st = con.prepareStatement("insert into Emp values(?,?)");
              java.sql.Statement st = con.createStatement();
              String q = "UPDATE Emp SET CITY = 'GA' where NAME = 'Abhi'";
              ResultSet r = st.executeQuery(q);
              System.out.println("no fo rows updated"+r);
//			st.setString(1, "Abhi");
//			st.setString(2, "okc");
//			st.setString(1, "mike");
//			st.setString(2, "Tx");
//			st.setInt(1, 123);
			//st.executeQuery();

//			ResultSet i = st.executeQuery("UPDATE Emp SET CITY = 'Duluth' where NAME = 'Abhi' ");
//			System.out.println(i + "records inserted");

			con.close();
		} catch (Exception e) {

		}

	}

}
