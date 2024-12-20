package com.ems.model;




/**
 * @author Sundhareshwar-V 
 * 
 * It is Model class of Employee
 * 
 */
public class Employee {
	private int eid;
	private String ename;
	private double esalary;
	
	/**
	 * It is Default Constructor
	 */

	public Employee() {
		super();

	}
	
	/**
	 * It is Constructor with parameters
	 */

	public Employee(int eid, String ename, double esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
   
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsalary() {
		return esalary;
	}

	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}

}