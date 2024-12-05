package com.day2;


public class ArrayOfArray2 {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[3][];
		
		arr[0] = new int[] {2, 3};
		arr[1] = new int[] {4, 5, 6, 7};
		arr[2] = new int[] {8, 9, 10};
		
		System.out.println("Array Elements are :");
		
		for(int x[] : arr) {
			for(int y : x) {
				
				System.out.print(y +" ");
			}
			System.out.println();
		}
		
		

	}

}
