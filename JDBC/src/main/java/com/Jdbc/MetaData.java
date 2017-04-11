package com.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class MetaData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");
		PreparedStatement p = con.prepareStatement("select * from Emp");
		ResultSet rs = p.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println("no.of coloumns"+rsmd.getColumnCount()+""+rsmd.getColumnTypeName(1)+""+rsmd.getColumnDisplaySize(1));
con.close();		
}
catch(Exception e){
	
}
		
		
	}

}
