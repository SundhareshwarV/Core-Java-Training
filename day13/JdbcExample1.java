package com.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcExample1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//Step-1 : Loading driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Step-2 : Making Connection With database // trainingsql.celcom.com
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com","training","Celcom123");
		
		//step-3 : Creating a statements
		//normal and prepared statements 
		
		//String sql = "insert into sundhar_employee values(?,?,?,?)";
		
		String sql = "Delete sundhar_employee where eid=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		//Step-4 : Executing
//		pstmt.setInt(1, 206);
//		pstmt.setString(2, "Ajith");
//		pstmt.setInt(3, 3000);
//		pstmt.setInt(4, 1);
		
		//Delete Query
		
		pstmt.setInt(1, 207);
	
		
		int n = pstmt.executeUpdate(); //it will use Insert, delete, update
		if( n == 1) {
			//System.out.println(" Employee Record Inserted");
			System.out.println("Employee Deleted");
		} else {
//			System.out.println("Employee Record Not Inserted");
			System.out.println("Employee Record Not Deleted");
		}
		
		//Step-6 :closing
		
		pstmt.close();
		con.close();
		
		
		
        
	}

}
