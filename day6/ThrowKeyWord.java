package com.day6;

public class ThrowKeyWord {
     //Throw KeyWord
	public static void main(String[] args) {
		
		try {
			//int a = 10 / 0;
			throw new ArithmeticException("Cannot Divide By 0");
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}
