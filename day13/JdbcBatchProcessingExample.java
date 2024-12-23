package com.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcBatchProcessingExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//Step-1 : Loading driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Step-2 : Making Connection With database // trainingsql.celcom.com
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com","training","Celcom123");
		
		//step-3 : Creating a statements
		//normal and prepared statements 
		
		String sql = "insert into sundhar_employee values(?,?,?,?)";
		
		//String sql = "Delete sundhar_employee where eid=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		Object employee[][] = new Object[][] {
			{701,"Rohit",34000,5},
			{702,"Sachin",44000,5},
			{703,"Roja",54000,5},
			{704,"Raja",84000,11},
		};
		
		
		for(int i=0 ; i<employee.length ; i++) {
			pstmt.setInt(1, (Integer)employee[i][0]);
			pstmt.setString(2, (String)employee[i][1]);
			pstmt.setInt(3, (Integer)employee[i][2]);
			pstmt.setInt(4, (Integer)employee[i][3]);
			
			pstmt.addBatch();
		}
		
		pstmt.executeBatch();
		
//		//Step-4 : Executing
//		pstmt.setInt(1, 406);
//		pstmt.setString(2, "sam");
//		pstmt.setInt(3, 9000);
//		pstmt.setInt(4, 11);
//		pstmt.addBatch();
//		
//		pstmt.setInt(1, 405);
//		pstmt.setString(2, "Arjun");
//		pstmt.setInt(3, 7000);
//		pstmt.setInt(4, 5);
//		pstmt.addBatch();
//		
//		pstmt.executeBatch();
//		
		//Delete Query
		
	//	pstmt.setInt(1, 207);
	
		
		
		//Step-6 :closing
		
		pstmt.close();
		con.close();
		
		
		
        
	}

}
