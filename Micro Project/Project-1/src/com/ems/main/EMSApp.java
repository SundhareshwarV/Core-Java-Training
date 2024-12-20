package com.ems.main;

import java.util.Scanner;

import com.ems.model.Employee;
import com.ems.service.EmployeeService;

/**
 * @version 1.0
 * It is Performing User Interface Things
 * 
 */


public class EMSApp {
	
	/**
	 *@return int
	 * It is Displaying the menu
	 * 
	 */

	static Scanner sc = new Scanner(System.in);

	public static int menu() {
		System.out.println("1. Insert Employee");
		System.out.println("2. Delete Employee");
		System.out.println("3. Update Employee");
		System.out.println("4. Find Employee");
		System.out.println("5. Find All Employee");
		System.out.println("6. Exit");

		System.out.println("Enter Your Choice : ");
		int choice = sc.nextInt();
		return choice;

	}
	
	/**
	 *@return Employee
	 * It is performing insertview Operations
	 * 
	 */

	public static Employee insertView() {
		System.out.println("Enter employee id, name and salary");

		return new Employee(sc.nextInt(), sc.next(), sc.nextDouble());

	}
	
	/**
	 *@return int
	 * It is performing deleteview Operations
	 * 
	 */


	public static int deleteView() {
		System.out.println("Enter employee id");
		int id = sc.nextInt();
		return id;

	}
	
	/**
	 *@return Employee
	 * It is performing updateView Operations
	 * 
	 */

	public static Employee updateView() {
		System.out.println("Enter employee id, name and salary");

		return new Employee(sc.nextInt(), sc.next(), sc.nextDouble());

	}
	/**
	 *@return int
	 * It is performing findView Operations
	 * 
	 */
	public static int findView() {
		System.out.println("Enter employee id");
		int id = sc.nextInt();
		return id;

	}
    
	/**
	 *@param args
	 * It is a main method Program will start the execution
	 * 
	 */
	public static void main(String[] args) {

		EmployeeService employeeService = new EmployeeService();

		String msg = "";
		String result = "";
		int id;
		Employee employee;

		do {
			int choice = menu();

			switch (choice) {
			case 1:
				employee = insertView();
				result = employeeService.insertValidation(employee);
				System.out.println(result);
				break;
			case 2:
				id = deleteView();
				result = employeeService.deleteValidation(id);
				System.out.println(result);
				break;
			case 3:
				employee = updateView();
				result = employeeService.updateValidation(employee);
				System.out.println(result);
				break;
			case 4:
				id = findView();
				result = employeeService.findValidation(id);
				System.out.println(result);
				break;
			case 5:
				result = employeeService.findAllValidation();
				System.out.println(result);
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("Enter Valid Choice");

			}

			System.out.println("Do you want to continue [Yes | No] : ");
			msg = sc.next();
		} while (msg.equalsIgnoreCase("Yes"));

	}

}
