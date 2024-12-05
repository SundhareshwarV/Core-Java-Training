package com.day2;

import java.util.Scanner;
public class DuplicateArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int DuplicateCount=0;
		
		System.out.println("Enter Array Size :");
		int arr[] = new int[sc.nextInt()];
		
		System.out.println("Enter "+ arr.length +" Elements :");
		for(int i = 0; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		for(int i = 0;i < arr.length ;i++) {
			 int count=0;
			 int x = arr[i];
			 for( int j = 0; j < arr.length; j++) {
				 if(x == arr[j] && x >= 0 )
				 {
					 count++;
					 arr[j]=-1;
				 }
			 }
			 if(count>1)
			 {
				 DuplicateCount++;
			 }
		}
		
		System.out.println("Duplicate Count :"+DuplicateCount);

	}

}
