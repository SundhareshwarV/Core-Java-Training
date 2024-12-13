package com.day5;


interface MyInterface {
	void myAbstractMethod1();
	void myAbstractMethod2();
	
}

class MyClass implements MyInterface {
	
	public void myAbstractMethod1() {
		System.out.println("Abstract Method - 1");
	}
    public void myAbstractMethod2() {
    	System.out.println("Abstract Method - 2");
		
	}
}
public class Interface1 {

	public static void main(String[] args) {
		
		MyInterface interface1;
		interface1 = new MyClass();
		interface1.myAbstractMethod1();
		interface1.myAbstractMethod2();
		
	}

}
