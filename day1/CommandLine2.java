package com.day1;

public class CommandLine2 {

	public static void main(String[] args) {
		int count=args.length;
	     if(count==2)
	     {  
	     int a=Integer.parseInt(args[0]);
	     int b=Integer.parseInt(args[1]);
	    
	     int c=a+b;
	     System.out.println("Addition :"+c);
	     }
	     else 
	      {
	       System.out.println("Please Enter Two values!!");
	     }


	}

}
