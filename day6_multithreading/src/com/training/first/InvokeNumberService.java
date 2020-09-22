package com.training.first;

import com.training.services.NumberService;

public class InvokeNumberService implements Runnable {

	private int countTo;
	private String threadName;
	private NumberService service;
	
	public InvokeNumberService(int countTo, String threadName) {
		super();
		
		//Setting up parameters passed from the main method
		this.countTo = countTo;
		this.threadName = threadName;
		
		//Creating an instance of our service
		this.service = new NumberService();
		
		//Passing the service instance, which is a runnable, to thread class along with a name
		Thread thread = new Thread(this, threadName);
		
		//Calling the start() method, makes the thread eligible for running
		thread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		//Calling the code that has to be executed in the thread
		//Indirectly adding code to the run method, by calling another method
		this.service.sumNumbers(countTo);
	}

}
