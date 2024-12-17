package com.day8;


public class StringClassMethods {

	public static void main(String[] args) {


		String str = "Java";
		
		System.out.println(str.length());//4
		System.out.println(str.charAt(2));//v
		System.out.println(str.concat(" Program")); //Java Program
		System.out.println(str.equals("java")); //false
		System.out.println(str.equalsIgnoreCase("java"));//true
		System.out.println(str.indexOf('a'));//1
		System.out.println(str.lastIndexOf('a'));//3
		System.out.println(str.indexOf('z')); //-1
		
		System.out.println(str.startsWith("Ja")); //true
		System.out.println(str.endsWith("ba")); //false
		
		System.out.println(str.replace('v', 'h'));//jaha
		System.out.println(str.toUpperCase()); //JAVA
		System.out.println(str.toLowerCase()); //java
		
		String s2 = "JAVA Program";
		
		System.out.println(s2.substring(3,8)); //A Pro
		System.out.println(s2.substring(5)); //Program
		
		
        
	}

}
