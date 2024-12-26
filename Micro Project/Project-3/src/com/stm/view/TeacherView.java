package com.stm.view;

import java.util.Scanner;
import com.stm.model.Teacher;

/**
 * It is TeacherViewing Class Like Taking Input
 */
public class TeacherView {

	static int id;
	static String name, subject;

	static Scanner sc = new Scanner(System.in);

	public static Teacher insertTeacherView() {
		System.out.println("Enter Teacher Id, Name and Subject");

		id = sc.nextInt();
		name = sc.next();
		subject = sc.next();

		return new Teacher(id, name, subject);

	}

	public static int deleteTeacherView() {
		System.out.println("Enter Teacher id");
		int id = sc.nextInt();
		return id;

	}

	public static Teacher updateTeacherView() {
		System.out.println("Enter Teacher Id, Name and Subject");

		id = sc.nextInt();
		name = sc.next();
		subject = sc.next();

		return new Teacher(id, name, subject);

	}

	public static int findTeacherView() {
		System.out.println("Enter Teacher id");
		int id = sc.nextInt();
		return id;

	}

	public static void insertTeacherResult(String result) {
		System.out.println(result);

	}

	public static void deleteTeacherResult(String result) {
		System.out.println(result);

	}

	public static void updateTeacherResult(String result) {
		System.out.println(result);

	}

	public static void findTeacherResult(String result) {
		System.out.println(result);

	}

	public static void displayAllTeacherResult(String result) {
		System.out.println(result);

	}

}
