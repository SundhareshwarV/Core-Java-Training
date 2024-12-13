package com.day5;

abstract class Vehicle {
	
	Vehicle() {
		
	}
	abstract void noOfWheel();
	
	void noOfEngine() {
		System.out.println("I have One Engine");
	}
	
	abstract void brandName();

}

class Car extends Vehicle {

	@Override
	void noOfWheel() {
		System.out.println("I have 4 Wheel");
		
	}

	@Override
	void brandName() {
		System.out.println("TATA");
		
	}	
}

class Bike extends Vehicle {

	@Override
	void noOfWheel() {
		System.out.println("I have 2 Wheel");
		
	}

	@Override
	void brandName() {
		System.out.println("Hero");
		
	}	
}


public class Abstraction2 {

	public static void main(String[] args) {
		
		Vehicle vehicle;
		
		//Car car = new Car();
		//Access Car Properties
		vehicle = new Car();
		vehicle.brandName();
		vehicle.noOfWheel();
		vehicle.noOfEngine();
		System.out.println("------------------ \n");
		//Access Bike Properties
		vehicle = new Bike();
		vehicle.brandName();
		vehicle.noOfEngine();
		vehicle.noOfWheel();
		System.out.println("------------------ \n");
		//Again Access Same car object 
		
		vehicle = new Car();
		vehicle.brandName();
		vehicle.noOfWheel();
		vehicle.noOfEngine();
		
		
		
	

	}

}
