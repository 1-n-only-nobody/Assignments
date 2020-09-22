package com.exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileSyncReaderWriter {

	File file = new File("abc.txt");
	
	public synchronized void write(String content) {
		
		try {
			FileWriter fileWriter = new FileWriter(file);
			
			fileWriter.write(content);
			
			fileWriter.close();
			
			notify();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public synchronized String read() {
		
		BufferedReader bufferedReader =  null;
		try {
			bufferedReader =  new BufferedReader(new FileReader(file));

			String line = null;
			
			if ((line = bufferedReader.readLine()) == null) {
				
				wait();

				bufferedReader.close();
				
				bufferedReader =  new BufferedReader(new FileReader(file));
				line = bufferedReader.readLine();
				bufferedReader.close();
				
			} else {
				
				bufferedReader.close();
			}

			return line;
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
