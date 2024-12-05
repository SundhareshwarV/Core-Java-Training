package com.day2;


class Mobile {
	
	String brand;
	double price;
	
	
	public Mobile(String brand, double price) {
		
		this.brand = brand;
		this.price = price;
	}
	
	void display() {
		
		System.out.println("Mobile Brand :" +brand);
		System.out.println("Mobile Price :" +price);
	}
	
}
public class ClassAndObject2 {

	public static void main(String[] args) {
		
	  Mobile mobile1 = new Mobile("Redmi",15000);
	  mobile1.display();
	  
	  System.out.println();
	  Mobile mobile2 = new Mobile("Oppo",20000);
	  mobile2.display();
		

	}

}
