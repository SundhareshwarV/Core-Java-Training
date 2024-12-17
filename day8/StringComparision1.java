package com.day8;

// (==) & equals
public class StringComparision1 {

	public static void main(String[] args) {
		
		String s1 = new String("Java");
		String s2 = new String("Java");
		
		System.out.println(s1 == s2); //false
		System.out.println(s1.equals(s2));//true
		
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
		
		String s3 = "Java";
		String s4 = "Java";
		
		System.out.println(s3 == s4); //true
		System.out.println(s3.equals(s4));//true
		
		//Check hash code
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
		System.out.println(s1 == s3); //false
		System.out.println(s1.equals(s3));//true
		
		
		

	}

}
