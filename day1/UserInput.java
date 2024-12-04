package com.day1;
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	     System.out.println("Enter Employee ID:");
	     int id=sc.nextInt();
	     sc.nextLine();
	     System.out.println("Enter Employee Name:");
	     String name=sc.nextLine();
	     System.out.println("Enter Employee Salary:");
	     float salary=sc.nextFloat();

	     System.out.println("Employee ID :"+id);
	     System.out.println("Employee Name :"+name);
	     System.out.println("Employee Salary :"+salary);


	}

}
