package com.day6;

public class ObjectAsignment {

	int value = 10;
	
	@Override
	protected void finalize() throws Throwable {
	
	}
	public static void main(String[] args) {
		
		ObjectAsignment obj1 = new ObjectAsignment();
	    ObjectAsignment	obj2 = obj1;
	    
	    obj2.value = 100;
	    
	    System.out.println(obj1.value);
	    
	    System.out.println(obj1.hashCode());
	    System.out.println(obj2.hashCode());
	   
	    // Just Checking Not Required Garbage collection 
	    
	    obj1 = null;
	    
	    System.gc();
	    
	    System.out.println(obj2.value);
	    
	    obj2 = null;
	    System.gc();
	    
	    System.out.println(obj2.value);
	    
	    
        	
	}

}
