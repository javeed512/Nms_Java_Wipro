package callable.stmt;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.wipro.app.DBUtil;

public class CallableDemo {
	
		
		public static void main(String[] args) {
			
		Connection conn =		DBUtil.getDBConnection();
		
		try {
			CallableStatement cstmt =conn.prepareCall("{call  EmpProcedure(?,?)}");
			
				cstmt.setInt(1, 116);
				cstmt.setString(2, "Durga");
			
				cstmt.execute();
			
				System.out.println("Procedure executed...");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
			
			
		}
		
	
	

}
