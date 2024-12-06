package com.day3;

class Doctor {
	
	String name = "sundhar";
	int age =23;
	
	Doctor()
	{
		this(2);
		System.out.println("Inside Super class Constructor");
	}
	
	Doctor(int x) {
		
		System.out.println("Inside Super class parametarized Constructor");
	}
	
}

class Patient extends Doctor {
	 
	Patient() {
		
		this("Sundhar");
		System.out.println("Inside sub class Constructor");
		System.out.println(name);
		System.out.println(super.name);
		name ="kishore";
	}
	
	Patient(String name) {
		super(2);
		System.out.println("Inside Sub class Parametarized Constructor");
		//System.out.println(age);
	}
	
	
	
	 
}

public class ConstructorInvocationOrder {

	public static void main(String[] args) {
		
		Patient patient = new Patient();

	}

}
