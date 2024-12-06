package com.day3;

//Creating Super class
class Vehicle {
	void noOfEngine() {
		System.out.println("I have one Engine");
	}
}

//sub class for Vehicle class
class TwoWheeler extends Vehicle {
	
	void noOfWheels() {
		System.out.println("I have two Wheels");
	}
}

//sub class for TwoWheeler  
class Bike extends TwoWheeler {
	
	void brandName() {
		System.out.println("Brand name is : Hero");
	}
	
}

public class SingleInheritance {

	public static void main(String[] args) {
		
		//Creating object for bike class and access all the properties in their super class because of Extends KeyWord
		Bike bike1 = new Bike();
		
		bike1.noOfEngine();
		bike1.noOfWheels();
		bike1.brandName();
		

	}

}
