package com.day6;

//Basics Exception
public class ExceptionBasic {
      int a = 10;
	public static void main(String[] args) {
		System.out.println("Before Exception");
		
		//int a = 10 /0; //Arithmetic exception
		
	//	int a[] = {10, 20 ,30};
	//	System.out.println(a[3]); //ArrayIndexOutofBoundException
		
	//	int arr[] = new int[-10]; //NegativeArraySizeException
		
	//	int a = Integer.parseInt("ABC"); //NumberFormatException
		
		ExceptionBasic eh = null;
		System.out.println(eh.a);   //NullPointerException
		
		System.out.println("After Exception");

	}

}
