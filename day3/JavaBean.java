package com.day3;

class Employee {
	
	private int id;
	private String name;
	private double salary;
	
	//initialize all the values initially
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}   

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

    //Whenever we want any modification in specific field use Setter method
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
		
}

public class JavaBean {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(111, "Sundhar",50000);
			
		System.out.println(emp1.getId());
		System.out.println(emp1.getName());
		System.out.println(emp1.getSalary());
		
		emp1.setSalary(80000);
		System.out.println("After Updating salary :");
		
		System.out.println(emp1.getId());
		System.out.println(emp1.getName());
		System.out.println(emp1.getSalary());
		
	}

}
