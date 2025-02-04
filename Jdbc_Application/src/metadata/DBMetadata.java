package metadata;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import com.wipro.app.DBUtil;

public class DBMetadata {

	public static void main(String[] args) {


	    Connection conn =		DBUtil.getDBConnection();
	    
	    			try {
						
	    				
	    		DatabaseMetaData  metaData =		conn.getMetaData();
	    		
	    			System.out.println("Driver Name "+metaData.getDriverName());
	    			
	    			System.out.println("Url "+metaData.getURL()); 
	    			
	    			System.out.println("User "+ metaData.getUserName());
	    		
					
	    			
	    			} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
		
	}

}
