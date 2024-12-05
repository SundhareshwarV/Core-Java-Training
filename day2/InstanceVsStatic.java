package com.day2;

public class InstanceVsStatic {

	int a = 10;
	static int x = 30;
	public static void main(String[] args) {
		
		//Instance variable
		System.out.println("Instance Variable ");
		InstanceVsStatic obj1 = new InstanceVsStatic();
		System.out.println(obj1.a);
		
		InstanceVsStatic obj2 = new InstanceVsStatic();
		System.out.println(obj2.a);
		
		obj1.a = 100;
		
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		System.out.println("Static Variable ");
		
		System.out.println(obj1.x);
		System.out.println(obj2.x);
		
		obj1.x = 200;
		
		System.out.println(obj1.x);
		System.out.println(obj2.x);
	
	}

}
