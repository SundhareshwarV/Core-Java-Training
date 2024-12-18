package com.day9;

import java.util.Enumeration;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		
		Vector<Integer> vec = new Vector<>(3,2); //3 Capacity , 2 How many add after fills 
		
		System.out.println(vec.size());//0
		System.out.println(vec.capacity());//3
		
		System.out.println("---------------------");
		
		vec.add(10);
		System.out.println(vec.size());//0
		System.out.println(vec.capacity());//3
		
		System.out.println("---------------------");
		
		vec.add(20);
		vec.add(30);
		System.out.println(vec.size());//0
		System.out.println(vec.capacity());//3
		
		System.out.println("---------------------");
		
		vec.add(40);
		System.out.println(vec.size());//0
		System.out.println(vec.capacity());//3
		
		System.out.println("---------------------");
		
		vec.add(50);
		vec.add(60);
		System.out.println(vec.size());//0
		System.out.println(vec.capacity());//3
		
		System.out.println("---------------------");
		
		Enumeration<Integer> e = vec.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		

	}

}
