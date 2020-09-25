package com.training.firstExtended;

import java.io.IOException;

public class ThreadJoinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main Thread Starts.");
		
		Thread t = new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
//				super.run();
				
				System.out.println("Child Thread Starts.");
				
				try {
					
					System.out.println("Enter a key.");
					
					int key = System.in.read();
					
					System.out.println((char) key);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Child Thread Ends.");
			}
			
		};
		
		t.start();
		
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main Thread Ends.");
	}

}
