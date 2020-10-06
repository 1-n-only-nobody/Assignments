package com.training.second;

public class UsePrintString implements Runnable {
	
	private String str1;
	private String str2;
	
	public UsePrintString(String str1, String str2) {
		super();
		
		//Setting up parameters passed from the main method
		this.str1 = str1;
		this.str2 = str2;
		
		Thread thread = new Thread(this);
		
		thread.start();
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		PrintStrings.printString(str1, str2);

	}

}
