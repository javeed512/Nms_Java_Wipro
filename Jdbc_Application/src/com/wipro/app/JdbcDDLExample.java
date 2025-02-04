package com.wipro.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcDDLExample {

	public static void main(String[] args) {


	
		
		try {
			
			//step1 register driver class
			DriverManager.registerDriver( new com.mysql.cj.jdbc.Driver() );
			
			//step2  get the DB Connection
			
		Connection conn =	DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro_db", "root", "admin");
			
					Statement stmt =conn.createStatement();
					
					/*
					 * String query =
					 * "CREATE TABLE Employees (Eid integer(3) primary key , EName varchar(20),Salary double)"
					 * ;
					 * 
					 * stmt.execute(query);
					 * 
					 * System.out.println("Employee table created..");
					 */
					
				
					
					String  insertQuery = "insert into Employees  values(101,'king',90000)";
					
					int  count =	stmt.executeUpdate(insertQuery);
				
					System.out.println(count +"  rows affected...");
		
						 conn.close();		
						 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
