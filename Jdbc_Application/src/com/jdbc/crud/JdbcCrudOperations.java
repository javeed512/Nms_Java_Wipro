package com.jdbc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcCrudOperations {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step2 get the DB Connection

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro_db", "root", "admin");

			//String insertQuery = "insert into Employees  values(?,?,?)"; // positional parameters

			conn.setAutoCommit(false);
			
			//	String updateQuery = "update  Employees set ename = ? ,  salary = ?  where eid = ?";
			
					String deleteQuery = "delete  from Employees where eid = ?";
			 
			
			PreparedStatement pstmt = conn.prepareStatement(deleteQuery);
			
			/*  // insert parameters
			 * pstmt.setInt(1, 101); pstmt.setString(2, "king"); pstmt.setDouble(3, 90000);
			 */
			
			/*   // update parameters
			 * pstmt.setString(1, "king khan"); pstmt.setDouble(2, 99000); pstmt.setInt(3,
			 * 101);
			 */
			
			// delete parameter
			
				 pstmt.setInt(1, 101);
			
			
					int count =		pstmt.executeUpdate();
			
					System.out.println(count +" records affected..");
					
						conn.commit();
						//conn.rollback();
					
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
