package com.day4;

class Vehicle {
	
	void noOfEngine() {
		System.out.println("I have One Engine");
	}
	
	void noOfWheels() {
		System.out.println("Cannot defined here");
	}
}

class TwoWheeler extends Vehicle {
	
	void noOfWheels() {
		System.out.println("I have Two Wheels");
	}
	
}
public class MethodOverriding {

	public static void main(String[] args) {
		
		TwoWheeler twoWheeler = new TwoWheeler();
		twoWheeler.noOfWheels();
		
		//It will call Superclass method 
		
		Vehicle twoWheeler1 = new Vehicle();
		twoWheeler1.noOfWheels();
		
		

	}

}
