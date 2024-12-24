package com.ems.view;

import java.util.Scanner;

import com.ems.model.Department;
import com.ems.model.Employee;
import com.ems.service.EmployeeService;

public class DepartmentView {
	
static Scanner sc = new Scanner(System.in);
	
	static int dno;
	static String dname;

	
	
	/**
	 *@return Employee
	 * It is performing insertview Operations
	 * 
	 */

	public static Department insertDepartmentView() {
		System.out.println("Enter Department Number and name ");
		dno = sc.nextInt();
		dname = sc.next();
				
 
        
		return new Department(dno, dname);

	}
	
	/**
	 *@return int
	 * It is performing deleteview Operations
	 * 
	 */


	public static int deleteDepartmentView() {
		System.out.println("Enter Department Number ");
		return sc.nextInt();

	}
	
	/**
	 *@return Employee
	 * It is performing updateView Operations
	 * 
	 */

	public static Department updateDepartmentView() {
		 
		System.out.println("for Update Enter new  dno, dName");
		
		dno = sc.nextInt();
		dname = sc.next();
		
		return new Department(dno,dname);
 
	}
	/**
	 *@return int
	 * It is performing findView Operations
	 * 
	 */
	public static int findDepartmentView() {
	System.out.println("Enter Department id = ");
	return sc.nextInt();

}
//

}
