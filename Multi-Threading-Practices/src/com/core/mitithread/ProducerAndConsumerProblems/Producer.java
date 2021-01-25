package com.core.mitithread.ProducerAndConsumerProblems;

public class Producer extends Thread {
	
	Company c;
	
	Producer(Company c) {
		
		this.c = c;
	}
	
	@Override
	public void run() {
		
		int i = 0;
		while (true) {
			
			this.c.produce_item(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				
			}
			i++;
		}
	}

}
