package com.day2;

import java.util.Scanner;
public class OddEvenArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int oddCount = 0;
		int evenCount = 0;
		System.out.println("Enter Array Size :" );
		int arr[] = new int[sc.nextInt()];
		
		System.out.println("Enter "+ arr.length +" Elements :");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 2 == 0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}
		
		System.out.println("Even Number Count is :" +evenCount);
		System.out.println("Odd Number Count is :" +oddCount);
		

	}

}
