package com.day9;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Implements Serializable Interface
class Employee implements Serializable {
	private int id;
	private String name;
	transient private float salary; //If we use transiant key word it cannot be serialized 
	
	Employee() {
		
	}
	
	Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
}

public class Serialization1 {

	public static void main(String[] args) throws Exception {
		
	//Serialization
		
		Employee emp1 = new Employee(101,"Sundhar",34000);
		
		//Create a Normal file for storing object
		FileOutputStream fout = new FileOutputStream("C:\\Users\\Sundhareshwar-V\\OneDrive - Celcom Solutions\\Desktop\\ObjectFile.txt");
		
		//Convert it into a ObjectOutputStream
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		
		objout.writeObject(emp1);
		
		objout.close();
		fout.close();
		
		System.out.println("Object created Successfully");
		
		
		//DeSerialization
		
		FileInputStream fin = new FileInputStream("C:\\Users\\Sundhareshwar-V\\OneDrive - Celcom Solutions\\Desktop\\ObjectFile.txt");
		
		ObjectInputStream objin = new ObjectInputStream(fin);
		
		Employee emp2 = (Employee) objin.readObject();
		
		objin.close();
		fin.close();
		
		System.out.println("Employee id : " +emp2.getId());
		System.out.println("Employee Name : " +emp2.getName());
		System.out.println("Employee Salary : " +emp2.getSalary());
		
	}

}
