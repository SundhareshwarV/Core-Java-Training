package com.ems.model;

/**
 * @author Sundhareshwar-V
 * @version 1.1 It is a bean Class fro Department
 */

public class Department {

	private int dno;
	private String dname;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int dno, String dname) {
		super();
		this.dno = dno;
		this.dname = dname;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Department [dno=" + dno + ", dname=" + dname + "]";
	}

}
