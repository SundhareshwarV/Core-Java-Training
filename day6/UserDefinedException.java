package com.day6;

import java.util.Scanner;


//By Extending Exception We extends checked 
class AgeException extends Exception {
	
	@Override
	public String toString() {
		return "Invalid Age";
	}
	 
}

public class UserDefinedException {
        
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age :");
		int age = sc.nextInt();
		if( age >= 18) {
			System.out.println("Eligible for Vote");
		}
		else {
			try {
				throw new AgeException();
			} 
			catch(AgeException e) {
			    System.out.println(e);
			}
			
		}
	}

}
