package com.day6;

//Java - Garbage Collection
public class GarbageCollection {

	static int count = 0;
	
	GarbageCollection() {
		count++;
		System.out.println(count);
		
	}
	
	@Override
	//We can use Public also
	protected void finalize() throws Throwable {
		
		count--;
		System.out.println(count);
	}
	public static void main(String[] args) {
		
		GarbageCollection gc1 = new GarbageCollection();
		GarbageCollection gc2 = new GarbageCollection();
		
		gc1 = null;
		System.gc();
		
		gc2 = null;
		Runtime.getRuntime().gc();	

	}

}
