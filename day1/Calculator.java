package com.day1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg = "";
		do {
			System.out.println("Enter First Number :");
			int a = sc.nextInt();
			System.out.println("Enter Second Number :");
			int b = sc.nextInt();

			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			System.out.println("Enter Your Choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Addition : " + (a + b));
				break;
			case 2:
				System.out.println("Subtraction : " + (a - b));
				break;
			case 3:
				System.out.println("Multiplication :" + (a * b));
				break;
			case 4:
				System.out.println("Division :" + (a / b));
				break;
			case 5:
				System.out.println("Thankyou");
				
				return;

			default:
				System.out.println("Invalid input");

			}
			//sc.nextLine();
			System.out.println("Do You Want To Continue[Yes / No]");

			msg = sc.next();

		} while (msg.equalsIgnoreCase("Yes"));

	}
}
