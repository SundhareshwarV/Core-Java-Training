package com.day7;

class TwoTable implements Runnable {
	
	@Override
	public synchronized void run() {
		for( int i = 1; i <= 10; i++) {
			System.out.println(i+ " * 2 = "+(i*2));
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e) {
			
		}
		
	}
	
}
}

class FiveTable extends Thread {
	
	@Override
	public synchronized void run() {
		for( int i = 1; i <= 10; i++) {
			System.err.println(i+ " * 5 = "+(i*5));
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e) {
			
		}
		
	}
	
}
}


public class TablesUsingThread {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(new TwoTable());
		t1.start();
		
		//t1.join();
		
		FiveTable t2 = new FiveTable();
		t2.start();

	}

}

