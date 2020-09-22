package com.exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileSyncReaderWriter {

	//Creating a file object
	File file = new File("abc.txt");
	
	public synchronized void write(String content) {
		System.out.println("Create file if does not exists");
		try {
			//Filewriter to write to a file
			//Will create a file if it does not exist
			FileWriter fileWriter = new FileWriter(file);
			
			fileWriter.write(content);
			
			fileWriter.close();
			System.out.println("successfully written to file");
			System.out.println("notifying others");
			//allow other waiting threads to continue execution
			notify();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public synchronized String read() {
		
		BufferedReader bufferedReader =  null;
		String line = null;
		try {
			//waits if file does not exist.
			
			if (!file.isFile()) {
				System.out.println("File existence check : Fail");
				System.out.println("waiting.");
				wait();
			}
			System.out.println("File existence check : Pass");
			bufferedReader =  new BufferedReader(new FileReader(file));
			
			if ((line = bufferedReader.readLine()) == null) {
				System.out.println("Empty file detected");
				System.out.println("waiting.");
				wait();
				
				line = bufferedReader.readLine();
			}
			System.out.println("successfully read");
			bufferedReader.close();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return line;
	}
}
