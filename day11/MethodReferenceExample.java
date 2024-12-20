package com.day11;


@FunctionalInterface
interface MyInterface1 {
	void message();
}
 class MyClass {
	MyClass() {
		System.out.println("My Constructor");
	}
	
	public void myInstanceMethod() {
		System.out.println("My Instance Method");
	}
	
	public static void myStaticMethod() {
		System.out.println("My Static Method");
	}
	
	
	
	
}


public class MethodReferenceExample {

	public static void main(String[] args) {
		
		//Reference to a Instance Method
		MyClass obj = new MyClass();
		MyInterface1 reference = obj::myInstanceMethod;
		reference.message();
		//Reference to a Static Method
		reference = MyClass::myStaticMethod;
		reference.message();
		//Reference to Constructor
		reference = MyClass::new;
		reference.message();
		
	}

}
