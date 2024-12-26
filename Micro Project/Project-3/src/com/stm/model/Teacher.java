package com.stm.model;

public class Teacher {
	
	private int tid;
	private String name;
	private String subject;
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(int tid, String name, String subject) {
		super();
		this.tid = tid;
		this.name = name;
		this.subject = subject;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", name=" + name + ", subject=" + subject + "]";
	}
	
	

}
