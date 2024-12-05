package com.day2;

import java.util.Scanner;

public class ArrayExample1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		
		System.out.println("Enter Array Length :");
        int length = sc.nextInt();	
        
		int arr[] = new int[length];
		

		System.out.println("Initial Array Elements :");
		for(int i = 0; i < arr.length; i++) {
			 System.out.println(arr[i]);
		}
		
		System.out.println("Enter "+ arr.length +" Elements :");
		for(int i = 0 ;i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		

		System.out.println("After Storing Array Elements :");
		for(int i = 0; i < arr.length; i++) {
			 System.out.println(arr[i]);
			 sum +=arr[i];
		}
		
		System.out.println("The sum of Array : "+sum);
		
		

	}

}
