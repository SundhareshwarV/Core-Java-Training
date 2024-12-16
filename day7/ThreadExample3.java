package com.day7;

class MyThread3 extends Thread {
	@Override
	public void run() {
		for(int i = 1; i <= 5 ;i++) {
		System.out.println(Thread.currentThread().getName()+" My thread is Running");
		try {
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			
		}
		
		}
	}
}
public class ThreadExample3 {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread3 t = new MyThread3();
		t.setName("T1");
		t.start();
		
		try {
			Thread.sleep(3000);
		}
		catch (InterruptedException e) {
			
		}
		
		t.join();
		
		System.out.println("End of Main");
		

	}

}
