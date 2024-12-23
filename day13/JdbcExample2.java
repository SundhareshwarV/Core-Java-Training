package com.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcExample2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//Step-1 : Loading driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Step-2 : Making Connection With database // trainingsql.celcom.com
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com","training","Celcom123");
		
		//step-3 : Creating a statements
		//Update Query 
		
		//String sql = "update sundhar_employee set esalary = ? where ename = ?";
		String sql = "update sundhar_employee set Dno = ? where ename = ?";
		//String sql = "Delete sundhar_employee where eid=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		//Step-4 : Executing
		
		//Update Query
		
		pstmt.setInt(1, 5);
		pstmt.setString(2,"Hari");
	
		
		int n = pstmt.executeUpdate(); //it will use Insert, delete, update
		if( n == 1) {
			//System.out.println(" Employee Record Inserted");
			System.out.println("Employee Updated");
		} else {
//			System.out.println("Employee Record Not Inserted");
			System.out.println("Employee Record Not Updated");
		}
		
		//Step-6 :closing
		
		pstmt.close();
		con.close();
		
		
		
        
	}

}
