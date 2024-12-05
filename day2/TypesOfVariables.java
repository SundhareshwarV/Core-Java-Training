package com.day2;

public class TypesOfVariables {

	int b = 20; //Instance or Object Variable
	
	static int c = 40; //static Variable or class Variable
	public static void main(String[] args) {

       int a = 10; //Local Variable
       System.out.println("Local Variable :"+a);
       
       TypesOfVariables obj = new TypesOfVariables();
       System.out.println("Instance Variable :" +obj.b);
       
       System.out.println("Static Variable :" +TypesOfVariables.c);
       
       

	}

}
