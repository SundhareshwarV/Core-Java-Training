package com.day2;

//Class and Object
class Employee1 {
	
	 int id ;
	 String name;
	 double salary;
	
	//Constructor
	public Employee1(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		
		this.display();//Calling Current Class Method
	}
	
	Employee1() {
		
		this(001, "Sundhar", 65000); //Calling current Class Constructor
		//this(102, "Kishore", 34000);
		 
	}
	
	public void display() {
		
		System.out.println("ID :" +id);
		System.out.println("Name :" +name);
		System.out.println("salary :" +salary);
	}
	
}


public class ThisKeyWord {

	public static void main(String[] args) {
		
		Employee1 emp = new Employee1();

	}

}
