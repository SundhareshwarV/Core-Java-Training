package com.day7;

class MyThread1 extends Thread {
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
public class ThreadExample2 {

	public static void main(String[] args) {  
        MyThread1 t1 = new MyThread1();
        t1.setName("T1");
        t1.start();
        
        try {
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			
		}
        try {
        	t1.suspend();
        }  catch (UnsupportedOperationException e) {
        	
        }
        
        
        System.out.println(t1.getState());
        
        try {
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			
		}
        try {
        	t1.resume();;
        }  catch (UnsupportedOperationException e) {
        	
        }
       // t1.j
        
       // t1.resume();
        
        System.out.println("Main End");
        
        
    
	}

}
