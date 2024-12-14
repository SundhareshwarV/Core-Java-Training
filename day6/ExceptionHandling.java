package com.day6;


//ArithmaticException are from java.lang Package so No need to Import it
public class ExceptionHandling {

	public static void main(String[] args) {
		
		System.out.println("Before Exception");
			
		try {
			int c[] = new int[-5];
			int a = 10 / 0;
			int b = Integer.parseInt("ABc");
			
			
		}
		catch(ArithmeticException e) {
			//System.out.println(e.getMessage());
			System.out.println("Number Cannot Divisible by 0");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			//System.out.println(e.getMessage());
			System.out.println("Cannot find Index");
		}
		catch(NumberFormatException e) {
			//System.out.println(e.getMessage());
			System.out.println("c");
		}
		
 		catch(Exception e) {
 			System.out.println("D");
 		}
		finally {
			System.out.println("This is Finally Block");
		}
		
		
		System.out.println("After Exception ");
	}

}
