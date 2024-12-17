package com.day8;

public class StringImmutable {

	public static void main(String[] args) {
		
		String str = new String("Java");
		str.concat(" World");
		System.out.println(str); //Java
		
		str = str.concat(" World");
		System.out.println(str); //Java World
		
		

	}

}
