package com.day11;


@FunctionalInterface
interface myInterface {
	
	int calci(int a, int b); //public & abstract
	
}
/*
//Without Lamda Expression
class Addition implements myInterface {

	@Override
	public int calci(int a, int b) {
	     return a+b;
	}
	
}

class Subtraction implements myInterface {

	@Override
	public int calci(int a, int b) {
	     return a-b;
	}
	
}   */



public class FunctionalInterface1 {

	public static void main(String[] args) {
		
		myInterface ref;
		ref = (a,b) -> a+b;
		System.out.println(ref.calci(10, 20));
		System.out.println(ref.calci(5, 20));
		
		 ref = (a,b) -> a-b;
		System.out.println(ref.calci(100, 20));
		System.out.println(ref.calci(50, 20));
	
	}

}
