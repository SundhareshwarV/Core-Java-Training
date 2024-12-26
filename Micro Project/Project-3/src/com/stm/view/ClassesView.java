package com.stm.view;

import java.util.Scanner;

import com.stm.model.Classes;
import com.stm.model.Teacher;

/**
 * It is a ClassesView class Display Menu and Classes Front end Things
 */
public class ClassesView {

	static int id, tid;
	static String name, msg;
	static Scanner sc = new Scanner(System.in);
	
	/**
	 *
	 * @return int
	 *  Display all Menu
	 */

	public static int allMenu() {

		System.out.println("1. Insert Classes ");
		System.out.println("2. Delete Classes ");
		System.out.println("3. Update Classes ");
		System.out.println("4. Find Classes ");
		System.out.println("5. Display All Classes ");
		System.out.println("6. Insert Teacher");
		System.out.println("7. Delete Teacher");
		System.out.println("8. Update Teacher");
		System.out.println("9. Find Teacher");
		System.out.println("10. Display All Teacher");
		System.out.println("11. Exit");

		System.out.println("Enter Your Choice :");
		int choice = sc.nextInt();
		return choice;

	}

	public static void invalidChoice() {
		System.out.println("Enter Valid Choice");
	}

	public static String continueMessage() {
		System.out.println("Do you want to continue [Yes | No] : ");
		return msg = sc.next();

	}

	public static Classes insertClassesView() {
		System.out.println("Enter Class Id, Name and Teacher id");

		id = sc.nextInt();
		name = sc.next();
		tid = sc.nextInt();

		Teacher teacher = new Teacher();
		teacher.setTid(tid);

		return new Classes(id, name, teacher);

	}

	public static int deleteClassesView() {
		System.out.println("Enter Class id");
		int id = sc.nextInt();
		return id;

	}

	public static Classes updateClassesView() {
		System.out.println("Enter Class Id, Name and Teacher id");

		id = sc.nextInt();
		name = sc.next();
		tid = sc.nextInt();

		Teacher teacher = new Teacher();
		teacher.setTid(tid);

		return new Classes(id, name, teacher);

	}

	public static int findClassesView() {
		System.out.println("Enter Class id");
		int id = sc.nextInt();
		return id;

	}

	public static void insertClassesResult(String result) {
		System.out.println(result);

	}

	public static void deleteClassesResult(String result) {
		System.out.println(result);

	}

	public static void updateClassesResult(String result) {
		System.out.println(result);

	}

	public static void findClassesResult(String result) {
		System.out.println(result);

	}

	public static void displayAllClassesResult(String result) {
		System.out.println(result);

	}

}
