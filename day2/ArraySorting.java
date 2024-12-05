package com.day2;

import java.util.Arrays;
import java.util.Scanner;
public class ArraySorting {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Length :");
        int length = sc.nextInt();	
        
		int arr[] = new int[length];
		
		System.out.println("Enter "+ arr.length +" Elements :");
		for(int i = 0 ;i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println("After Sorting :");
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println("Reverse :");
		
        for(int i = arr.length-1; i >= 0; i--) {
			
			System.out.print(arr[i]+" ");
		}
        
  /*      for(int x:arr)
        {
        	System.out.println(x);
        }  */
	}

}
