package com.Jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   try{
	   Class.forName("oracle.jdbc.driver.OracleDriver");
	   Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");   
	   java.sql.Statement smt = con.createStatement();
	   
	   System.out.println("Db connecti0on is created");
   }catch(ClassNotFoundException e){
	   e.printStackTrace();
   }catch(SQLException e){
	   e.printStackTrace();
	   
   }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
