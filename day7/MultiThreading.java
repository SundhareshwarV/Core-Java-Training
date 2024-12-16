package com.day7;

class MyThread extends Thread {
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

public class MultiThreading {
	
	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		System.out.println(t); //[main,5,main]
		
		System.out.println(t.getPriority());//5
		System.out.println(t.getName());//main
		System.out.println(t.getState());//Runnable
		//System.out.println(t.getId());
		
        System.out.println(t.getClass());//java.lang.Thread
        
        System.out.println(t.getThreadGroup());
        
        MyThread t1 = new MyThread();
        t1.setName("T1");
        t1.start();
        
        MyThread t2 = new MyThread();
        t2.setName("T2");
        t2.start();
        
        System.out.println("Main End");
        //t1.run();
	}
	

}
