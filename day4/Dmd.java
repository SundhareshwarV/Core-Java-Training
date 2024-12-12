package com.day4;

class Animal {
	
	void sound() {
		System.out.println("No Specific sound..");
	}
	
	void eat() {
		System.out.println("Inside animal Class");
	}
}

class Dog extends Animal {
	
	void sound() {
		System.out.println("Dog making Sound");
	}	
	
	void dogEat() {
		System.out.println("somthing");
	}
}


public class Dmd {

	public static void main(String[] args) {
		
	Dog animal = new Dog();
	animal.eat();
	animal.sound();
	
	
	}

}
