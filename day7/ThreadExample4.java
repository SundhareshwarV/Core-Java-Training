package com.day7;

class MyThread4 implements Runnable {
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
public class ThreadExample4 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread4());
		t1.setName("T1");
		t1.start();

	}

}
