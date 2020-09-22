package com.exercise;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating object
		FileSyncReaderWriter fileSyncReaderWriter = new FileSyncReaderWriter();
		
		Thread t1 = new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
//				super.run();
				System.out.println("read thread starts.");
				//Indirectly adding code to the run method, by calling another method
				System.out.println(fileSyncReaderWriter.read());
			}
			
		};
		
		t1.start();
		
		Thread t2 = new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
//				super.run();
				System.out.println("write thread starts.");
				//Indirectly adding code to the run method, by calling another method
				fileSyncReaderWriter.write("Write this to file.");
			}
			
		};
		
		t2.start();
	}

}
