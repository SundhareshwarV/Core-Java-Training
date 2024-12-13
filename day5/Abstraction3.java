package com.day5;

//Abstract class With Constructor
abstract class Vehicle1 {
	
	Vehicle1(int a) {
		System.out.println("Abstract class Constructor ");
		
	}
	
	abstract void noOfWheel();
	
	void noOfEngine() {
		System.out.println("I have One Engine");
	}
	
	abstract void brandName();

}

class Bike1 extends Vehicle1 {

	
	Bike1() {
		super(10);
	}
	@Override
	void noOfWheel() {
		System.out.println("I have 2 Wheel");
		
	}

	@Override
	void brandName() {
		System.out.println("Hero");
		
	}	
}



public class Abstraction3 {

	public static void main(String[] args) {
		
		Vehicle1 vehicle;
		
		vehicle = new Bike1();
		vehicle.brandName();
		vehicle.noOfEngine();
		vehicle.noOfWheel();

	}

}
