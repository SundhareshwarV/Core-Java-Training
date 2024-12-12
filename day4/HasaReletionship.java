package com.day4;


class Vehicle1 {
      
	void vehicle() {
		System.out.println("Vehicle has its own Functionalities!!");
	}
	
}

class Car extends Vehicle1 {
	
	Wheel wheel = null;
	
	Car(Wheel wheel) {
		this.wheel = wheel;
		
	}
	
	void carFunction() {
		System.out.println("Car Has its own Color ");
	}
	
	void carWheelFunctions() {
		wheel.wheelFunctions();
	}
	
	
}

class Wheel {
	
	void wheelFunctions() {
		System.out.println("Bike has a 2 Wheels");
		System.out.println("Car has a 4 Wheels");
		System.out.println("Wheel has its own Brand Name");
	}
}


public class HasaReletionship {

	public static void main(String[] args) {
		
		Wheel wheel = new Wheel();
		
		Car car = new Car(wheel);
		car.vehicle();
		car.carFunction();
		car.carWheelFunctions();
		

	}

}
