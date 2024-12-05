package com.day2;


public class ArrayOfArray {

	public static void main(String[] args) {
		
		int arr[][] = {{2, 3} , {4, 5, 6, 7}, {8, 9, 10}};
		
		System.out.println(arr.length);
		
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		
		System.out.println("Array Elements are :");
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		//Using For Each Loop
		
		System.out.println("Using ForEach Loop :");
		for(int x[] : arr) {
			for(int y : x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
