package com.core.mitithread.ProducerAndConsumerProblems;

public class Consumer extends Thread
{
	Company c;
	
	
	public Consumer(Company c) {
		super();
		this.c = c;
	}


	public void run() 
	{
		while (true) {
			
		this.c.consume_item();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			
		}
		
		}
		
		
	}
}