package com.ems.view;

import java.util.Scanner;

import com.ems.model.Department;
import com.ems.model.Employee;
import com.ems.service.EmployeeService;

public class EmployeeView {
	
static Scanner sc = new Scanner(System.in);
	
	static int eid, esalary , dno;
	static String ename, dname;

	
	
	/**
	 *@return Employee
	 * It is performing insertview Operations
	 * 
	 */

	public static Employee insertEmployeeView() {
		System.out.println("Enter employee id, name , salary , dno");
		eid = sc.nextInt();
		ename = sc.next();
		esalary = sc.nextInt();
		dno = sc.nextInt();
		
        Department department = new Department();
        department.setDno(dno);
        
		return new Employee(eid, ename, esalary, department);

	}
	
	/**
	 *@return int
	 * It is performing deleteview Operations
	 * 
	 */


	public static int deleteEmployeeView() {
		System.out.println("Enter employee id");
		int id = sc.nextInt();
		return id;

	}
	
	/**
	 *@return Employee
	 * It is performing updateView Operations
	 * 
	 */

	public static Employee updateEmployeeView() {
		System.out.println("Enter employee id, name , salary , dno to Update Employee");
		eid = sc.nextInt();
		ename = sc.next();
		esalary = sc.nextInt();
		dno = sc.nextInt();
		
        Department department = new Department();
        department.setDno(dno);
        
		return new Employee(eid, ename, esalary, department);

	}
	/**
	 *@return int
	 * It is performing findView Operations
	 * 
	 */
	public static int findEmployeeView() {
		System.out.println("Enter employee id");
		int id = sc.nextInt();
		return id;

	}


}
