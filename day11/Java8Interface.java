package com.day11;


interface MyInterface3 {
	
	void myAbstarctMethod();
	
	default void myDefaultMethod() {
		System.out.println("Inside Default Method");
		
	}
	
	static void myStaticMethod() {
		System.out.println("Inside Static Method");
		
	}
}

class MyClass1 implements MyInterface3 {

	
	public void myAbstarctMethod() {
		System.out.println("My Abstarct method from Class");
		
	}
	
	
	
}

public class Java8Interface {

	public static void main(String[] args) {
		
		MyClass1 obj;
		obj = new MyClass1();
		obj.myAbstarctMethod();
		obj.myDefaultMethod();
		MyInterface3.myStaticMethod();

	}

}
