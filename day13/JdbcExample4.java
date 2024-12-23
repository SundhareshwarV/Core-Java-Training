package com.day13;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JdbcExample4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//Step-1 : Loading driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Step-2 : Making Connection With database // trainingsql.celcom.com
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com","training","Celcom123");
		
		
		//DataBase MetaData
		DatabaseMetaData dbData = con.getMetaData();
		System.out.println(dbData.getDatabaseProductName());
		System.out.println(dbData.getDriverName());
		System.out.println(dbData.getDriverVersion());
		
		
		
		//step-3 : Creating a statements
		//Update Query 
		
		//String sql = "update sundhar_employee set esalary = ? where ename = ?";
		String sql = "select * from Sundhar_employee";
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		//Step-4 : Executing
		
		ResultSet rs = pstmt.executeQuery();//Select
		
		//Result Set MetaData
		
		ResultSetMetaData rsData = rs.getMetaData();
		System.out.println(rsData.getColumnCount());
		
		for(int i = 1 ; i <= rsData.getColumnCount(); i++) {
			System.out.println(rsData.getColumnName(i));
		}
		
		while(rs.next()) {
			System.out.println(rs.getInt("eid")+" "+rs.getString("ename")+" "+rs.getInt("esalary")+" "+rs.getInt("Dno"));
		}
		
		//Step-6 :closing
		
		pstmt.close();
		con.close();
		rs.close();

	}

}
