package com.core.multithred;

public class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println("value of i is "+i);
			try {
				
				Thread.sleep(1000);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		Thread th = new Thread(t1);
		//Another thread object creation
		
		MyAnotherThread at = new MyAnotherThread();
		th.start();
		
		
		at.start();
	}

}
