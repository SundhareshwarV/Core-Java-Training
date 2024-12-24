package com.ems.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.ems.model.Department;
import com.ems.model.Employee;
import com.ems.util.DBUtil;


/**
 * @author Sundhareshwar-V 
 * 
 * It is Performing all the CRUD Operations on List DB
 * 
 */
public class DepartmentRepo {
	
	/**
	 * 
	 * @param employee
	 * @return boolean
	 * 
	 * doInsert Method performing Inserting Employee Object into ListDatabase
	 */


	public boolean doInsertDepartment(Department department) {

		boolean flag = false;
		try {
		Connection con = DBUtil.getDBConnection();
		
		String sql = "insert into sundhar_department values(?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, department.getDno());
		ps.setString(2, department.getDname());
		
		
		int n = ps.executeUpdate();
		
		if(n == 1) {
			flag = true;
		} 
		} catch(SQLException e) {
			System.out.println("Insert Query Not Executed");
		}
		
		return flag;
		
	}
	
	/**
	 * 
	 * @param id
	 * @return boolean
	 * 
	 * doDelete Method performing Detele Employee Object into ListDatabase based on employee id
	 */

	public boolean doDeleteDepartment(int dno) {
	    boolean flag = false;
	    String sql = "DELETE sundhar_department WHERE dno = ?";
	    
	    // Use try-with-resources to automatically close the resources
	    try (Connection con = DBUtil.getDBConnection(); 
	         PreparedStatement ps = con.prepareStatement(sql)) {
	        
	        ps.setInt(1, dno);  // Set the department number to delete
	        
	        int n = ps.executeUpdate();
	        
	        if (n == 1) {
	            flag = true;  // Successfully deleted
	        }
	    } catch (SQLException e) {
	        System.err.println("Delete failed: " + e.getMessage());  // Log the exception message
	        e.printStackTrace();  // Print stack trace for debugging
	    }
	    
	    return flag;  // Return true if deleted, false otherwise
	}


	
	/**
	 * 
	 * @param employee
	 * @return boolean
	 * 
	 * doUpdate Method performing Update Employee Object into ListDatabase based on employee id
	 */


	public boolean doUpdateDepartment(Department department) {
		boolean flag = false;
		Connection con = DBUtil.getDBConnection();
		String sql = "Update sundhar_department set dname= ? where dno = ?";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
 
			ps.setString(1, department.getDname());
			ps.setInt(2, department.getDno());
 
			int n = ps.executeUpdate();
			if (n == 1) {
				flag = true;
			}
 
		} catch (SQLException e) {
			System.out.println("Update qurey not excute");
			e.printStackTrace();
		}
		return flag;
 
	}
	/**
	 * 
	 * @param id
	 * @return Employee Object
	 * 
	 * doFind Method performing Find Employee Object into ListDatabase based on employee id
	 */

	public Department doFindDepartment(int id) {
		 
		Department department = null;
		Connection con = DBUtil.getDBConnection();
		String sql = "select * from sundhar_department where dno = ?";
		PreparedStatement ps;
 
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
 
			if (rs.next()) {
				department = new Department();
				department.setDno(rs.getInt("dno"));
				department.setDname(rs.getString("dName"));
				// employee.setDepartment(rs.getInt());
 
			}
		} catch (SQLException e) {
 
			e.printStackTrace();
		}
 
		return department;
 
	}
	
	/**
	 * 
	 * @return Employee Object
	 * 
	 * doFindAll Method performing Display All Employee Object into ListDatabase
	 */

	public List<Department> doFindAllDepartment() {
		Department department = null;
		Connection con = DBUtil.getDBConnection();
		String sql = "select * from sundhar_department";
		List<Department> list = new LinkedList<>();
		PreparedStatement ps;
		ResultSet rs;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
 
			while (rs.next()) {
				department = new Department();
				department.setDno(rs.getInt("dno"));
				department.setDname(rs.getString("dName"));
				list.add(department);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
 
		return list;
 
	}

}
