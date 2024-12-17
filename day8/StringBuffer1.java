package com.day8;

public class StringBuffer1 {

	public static void main(String[] args) {
		
     StringBuffer strBuffer = new StringBuffer("Java");
		
		strBuffer.append(" World");
		System.out.println(strBuffer);
		
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		
		
		String str = "Madam";
		String str2 = new StringBuffer(str).reverse().toString();
		
		if(str.equals(str2)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}

	}

}
