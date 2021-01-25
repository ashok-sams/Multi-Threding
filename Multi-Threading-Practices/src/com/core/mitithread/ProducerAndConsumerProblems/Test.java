package com.core.mitithread.ProducerAndConsumerProblems;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company c = new Company();
		
		
		Producer p = new Producer(c);
		Consumer cu = new Consumer(c);
		p.start();
		cu.start();
	}

}
