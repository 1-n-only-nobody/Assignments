package com.training.first;

public class InvokeNumberService implements Runnable {

	private int countTo;
	private String threadName;
	
	public InvokeNumberService(int countTo, String threadName) {
		super();
		this.countTo = countTo;
		this.threadName = threadName;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
