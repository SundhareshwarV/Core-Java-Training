package com.day5;


abstract class MyAbstractClass {
	
	abstract void myAbstractMethod();
	
	abstract void myAbstractMethod2();
	
	void myNormalMethod() {
		System.out.println("This is my normal method / Concreate Method");
	}
}

class MyNormalClass extends MyAbstractClass {
	
	@Override
	void myAbstractMethod() {
		System.out.println("Inside my Abstract method 1");
		
	}

	@Override
	void myAbstractMethod2() {
		System.out.println("Inside my Abstract method 2");
		
	}
	
	
}

public class Abstraction {

	public static void main(String[] args) {
	  //Cannot create a Object for Abstract class because it is a incomplete class
	  //MyAbstractClass obj = new Abstraction();
		
		MyAbstractClass myAbstractClass;
		
		myAbstractClass = new MyNormalClass();
		myAbstractClass.myAbstractMethod();
		myAbstractClass.myAbstractMethod2();
		myAbstractClass.myNormalMethod();
		

	}

}
