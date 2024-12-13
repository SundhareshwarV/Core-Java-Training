package com.day5;

interface VehiclePlan {
	void noOfEngine();
	void noOfWheel();
	void brandName();

	
}

abstract class Vehicle5 implements VehiclePlan {
	public void noOfEngine() {
		System.out.println("I have One Engine");
	}
}

class Bike5 extends Vehicle5 {
	public void noOfWheel() {
		System.out.println("I have Two Wheels");
	}
	
	public void brandName() {
		System.out.println("Hero");
	}
}
public class Interface4 {

	public static void main(String[] args) {
		VehiclePlan plan;
		plan = new Bike5();
		
		plan.brandName();
		plan.noOfEngine();
		plan.noOfWheel();

	}

}
