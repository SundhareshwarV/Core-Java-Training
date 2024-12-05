package com.day2;


class Employee {
	
	 int id ;
	 String name;
	 double salary;
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void display() {
		
		System.out.println("ID :" +id);
		System.out.println("Name :" +name);
		System.out.println("salary :" +salary);
	}
	
}

public class ClassAndObject {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(101, "Sundhar", 450000);
		emp1.display();
		
		Employee emp2 = new Employee(102, "Kishore", 550000);
		emp2.display();
		

	}

}
