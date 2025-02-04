package com.wipro.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil { // utility class
	
	
	public static  Connection  getDBConnection() { // factory method
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// step2 get the DB Connection

		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro_db", "root", "admin");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		return conn;

		
	}

}
