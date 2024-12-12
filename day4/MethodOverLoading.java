package com.day4;


class OverLoad {
	
	void method(int a) {
		
		int fact=1;
		for(int i = 1 ; i <= a ;i++) {
			fact*=i;
		}
		System.out.println("Factorial of "+a +" is : "+fact );
		
	}
	
	void method(int a, int b) {
		
		System.out.println("The sum of two number is :"+(a+b));
		
	}
	
	void method(String str) {
		
		System.out.println("Welcome "+str);
		
	}
}
public class MethodOverLoading {

	public static void main(String[] args) {
		OverLoad overLoad = new OverLoad();
	    overLoad.method(5);
	    overLoad.method(5, 15);
	    overLoad.method("Sundhar");
	}

}
