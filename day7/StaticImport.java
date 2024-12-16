package com.day7;

import java.lang.String;

import static java.lang.Math.PI;
import static java.lang.Integer.parseInt;

import static java.lang.System.out;


public class StaticImport {

	static int a = 10; 
	
	public static void main(String[] args) {
		
		System.out.println(a);
		
		System.out.println(Math.PI); //Static final variable
		
		//Instead of using interger.ParseInt
		int b = parseInt("234"); 
		
		out.println(b); //Import system and using 
		
		System.out.println(PI);

	}

}
