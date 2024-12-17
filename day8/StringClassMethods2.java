package com.day8;

public class StringClassMethods2 {

	public static void main(String[] args) {
		
		String str = "Celcom";
		
		char ch[] = str.toCharArray();
		
		for(char x : ch) {
			System.out.println(x);
		}
		
		for(int i = 0 ; i < str.length(); i++) {
			System.out.print(str.charAt(i)+" ");
		}
		System.out.println();
		
		
		String str2 = "Welcom,to,Java,World";
		
		String arr[] = str2.split(" ");
		
		for(String x : arr) {
			System.out.println(x);
		}
		

	}

}
 