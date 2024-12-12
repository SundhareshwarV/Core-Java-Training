package com.day4;

class OverLoad1 {
	
	 OverLoad1(int a) {
		
		 this(10,20);
		int fact=1;
		for(int i = 1 ; i <= a ;i++) {
			fact*= i;
		}
		System.out.println("Factorial of "+a +" is : "+fact );
		
	}
	
	 OverLoad1(int a, int b) {
		this("Sundhar");
		System.out.println("The sum of two number is :"+(a+b));
		
	}
	
	 OverLoad1(String str) {
		
		System.out.println("Welcome "+str);
		
	}
}

public class ConstructorOverLoading {

	public static void main(String[] args) {
		
		OverLoad1 overLoad = new OverLoad1(5);

	}

}
