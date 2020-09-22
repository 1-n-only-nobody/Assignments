package com.exercise;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileSyncReaderWriter fileSyncReaderWriter = new FileSyncReaderWriter();
		
		Thread t1 = new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
//				super.run();
				System.out.println(fileSyncReaderWriter.read());
			}
			
		};
		
		t1.start();
		
		Thread t2 = new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
//				super.run();
				fileSyncReaderWriter.write("Hello My name is Manan.");
			}
			
		};
		
		t2.start();
	}

}
