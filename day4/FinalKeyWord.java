package com.day4;

//Final keyWord Used in Variable 

 class AccessModifier {
	
	final int a =10;
	
	static int b = 20;
	
	final void myMethod() {
		System.out.println("This is final method");
	}
	
}

class NewClass extends AccessModifier {
	
	//final void myMethod() {
	//	System.out.println("This is NewClass class");
	//}
	
}

public class FinalKeyWord {
    
	public static void main(String[] args) {
		
		
		AccessModifier am = new AccessModifier();
		System.out.println(am.a);
		am.myMethod();
		
		System.out.println("---------------");
		
		System.out.println(AccessModifier.b);
		AccessModifier.b = 400;
		System.out.println(AccessModifier.b);
		
		System.out.println("----------------");
		System.out.println("Inheriting final Properties but Not override");
		NewClass nc = new NewClass();
		System.out.println(nc.a);
		nc.myMethod();
			

	}

}
