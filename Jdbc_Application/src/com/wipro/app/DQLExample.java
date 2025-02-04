package com.wipro.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DQLExample {

	public static void main(String[] args) {


		Connection conn =		DBUtil.getDBConnection();
		
		String selectQuery = "select eid,ename,salary  from Employees where salary > ?";
		
		try {
			
		PreparedStatement pstmt = 	conn.prepareStatement(selectQuery);
		
		 pstmt.setDouble(1,30000);
			
		ResultSet  rs =		pstmt.executeQuery();
		
	 ResultSetMetaData  rsm =	rs.getMetaData();
	 
	 	System.out.println("Table "+  rsm.getTableName(1));
	 	System.out.println("columns "+ rsm.getColumnCount());
	 
			
					while(rs.next()) {
						
						
	System.out.println(rs.getInt("eid") +"  "+ rs.getString("ename") +" "+rs.getDouble(3) ); // here 3 is column number in table
						
						
					}
				
							
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
	}

}
