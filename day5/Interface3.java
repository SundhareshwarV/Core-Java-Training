package com.day5;



//Interfaces extends
interface MyInterface11 {
	void myAbstractMethod1();
	void myAbstractMethod2();
	
}

interface MyInterface12 extends MyInterface11 {
	void myAbstractMethod3();
}

class MyClass11 implements MyInterface12 {
	
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
public class Interface3 {

	public static void main(String[] args) {
		
	/*	MyInterface1 interface1;
		MyInterface2 interface2;
		
		interface2 = new MyClass();
		interface2.myAbstractMethod1();
		interface2.myAbstractMethod2();  */
		
		MyInterface12 myClass = new MyClass11();
		myClass.myAbstractMethod1();
		myClass.myAbstractMethod2();
		myClass.myAbstractMethod3();
		
		
		
	}

}