package com.day5;
//Multiple Inheritance

interface One {
	int a = 10; //Default Public static final
}

interface Two {
	int a = 20;
}
//Allow to inherit Multiple Interfaces
interface Three extends One, Two {
	
	void sum();
}
class NormalClass implements Three {
	public void sum() {
		System.out.println("The Sum is :" +(One.a+Two.a));
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		NormalClass obj = new NormalClass();
		obj.sum();

	}

}
