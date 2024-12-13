package com.day5;

//Implements Multiple Interfaces
interface MyInterface1 {
	void myAbstractMethod1();
	void myAbstractMethod2();
	
}

interface MyInterface2 {
	void myAbstractMethod3();
}

class MyClass1 implements MyInterface1,MyInterface2 {
	
	public void myAbstractMethod1() {
		System.out.println("Abstract Method - 1");
	}
    public void myAbstractMethod2() {
    	System.out.println("Abstract Method - 2");
		
	}
    
    public void myAbstractMethod3() {
    	System.out.println("Abstract Method - 3");
    }
}
public class Interface2 {

	public static void main(String[] args) {
		
	/*	MyInterface1 interface1;
		MyInterface2 interface2;
		
		interface2 = new MyClass();
		interface2.myAbstractMethod1();
		interface2.myAbstractMethod2();  */
		
		MyClass1 myClass = new MyClass1();
		myClass.myAbstractMethod1();
		myClass.myAbstractMethod2();
		myClass.myAbstractMethod3();
		
		
		
	}

}