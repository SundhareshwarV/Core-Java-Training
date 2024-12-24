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
public class EmployeeRepo {
	
	/**
	 * 
	 * @param employee
	 * @return boolean
	 * 
	 * doInsert Method performing Inserting Employee Object into ListDatabase
	 */

    DepartmentRepo departmentRepo = new DepartmentRepo();
	public boolean doInsertEmployee(Employee employee) {

		boolean flag = false;
		try {
		Connection con = DBUtil.getDBConnection();
		
		String sql = "insert into sundhar_employee values(?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, employee.getEid());
		ps.setString(2, employee.getEname());
		ps.setInt(3, employee.getEsalary());
		ps.setInt(4, employee.getDepartment().getDno());
		
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

	public boolean doDeleteEmployee(int id) {

		boolean flag = false;
		try {
		Connection con = DBUtil.getDBConnection();
		
		String sql = "delete sundhar_employee where eid = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, id);
		
		int n = ps.executeUpdate();
		
		if(n == 1) {
			flag = true;
		} 
		} catch(SQLException e) {
			System.out.println("Delete Query Not Executed");
		}
		
		return flag;
	}

	
	/**
	 * 
	 * @param employee
	 * @return boolean
	 * 
	 * doUpdate Method performing Update Employee Object into ListDatabase based on employee id
	 */


	public boolean doUpdateEmployee(Employee employee) {

		boolean flag = false;
		try {
		Connection con = DBUtil.getDBConnection();
		
		String sql = "update sundhar_employee set ename = ? , esalary = ? , dno = ? where eid = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		
		ps.setString(1, employee.getEname());
		ps.setInt(2, employee.getEsalary());
		ps.setInt(3, employee.getDepartment().getDno());
		ps.setInt(4, employee.getEid());
		
		int n = ps.executeUpdate();
		
		if(n == 1) {
			flag = true;
		} 
		} catch(SQLException e) {
			System.out.println("Update Query Not Executed");
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

	public Employee doFindEmployee(int id) {

		Employee employee = null;
		int deptNo;
		try {
			Connection con = DBUtil.getDBConnection();
			
			String sql = "select * from sundhar_employee where eid = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				employee = new Employee();
				employee.setEid(rs.getInt("eid"));
				employee.setEname(rs.getString("ename"));
				employee.setEsalary(rs.getInt("esalary"));
				
				deptNo = rs.getInt("dno");
				Department department = departmentRepo.doFindDepartment(deptNo);
				employee.setDepartment(department); 
				
			}
			
			
		} catch(SQLException e) {
			System.out.println("Find Query Not Executed");
		}
		return employee;

	}
	
	/**
	 * 
	 * @return Employee Object
	 * 
	 * doFindAll Method performing Display All Employee Object into ListDatabase
	 */

	public List<Employee> doFindAllEmployee() {
		
		List<Employee> list = new LinkedList<>();
		int deptNo;

		try {
			Connection con = DBUtil.getDBConnection();
			
			String sql = "select * from sundhar_employee";
			PreparedStatement ps = con.prepareStatement(sql);
			
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Employee employee = new Employee();
				employee.setEid(rs.getInt("eid"));
				employee.setEname(rs.getString("ename"));
				employee.setEsalary(rs.getInt("esalary"));
				
				deptNo = rs.getInt("dno");
				Department department = departmentRepo.doFindDepartment(deptNo);
				employee.setDepartment(department); 
				
				list.add(employee);
				
			}
			
			
		} catch(SQLException e) {
			System.out.println("Find Query Not Executed");
		}
		return list;

	}

}
