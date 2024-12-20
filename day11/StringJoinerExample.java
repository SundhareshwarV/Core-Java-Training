package com.day11;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		
		StringJoiner joiner = new StringJoiner(",");
		
		joiner.add("One");
		joiner.add("Two");
		joiner.add("Three");
		
		String result = joiner.toString();
		System.out.println(result);
		
        StringJoiner joiner1 = new StringJoiner(",", "{","}"); //, is seperator ... [ this is prefix .... ] this is suffix
		
		joiner1.add("One");
		joiner1.add("Two");
		joiner1.add("Three");
		
		String result1 = joiner1.toString();
		System.out.println(result1);
		

	}

}
