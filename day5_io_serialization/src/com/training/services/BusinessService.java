package com.training.services;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

import com.training.model.Book;
import com.training.model.CreditCard;

public class BusinessService {
	
	public boolean storeInCharacters(CreditCard[] creditCard, File file) {
		
		PrintWriter outChar = null;
		String s = null;
		try {
			outChar = new PrintWriter(new FileWriter(file, true));
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for (CreditCard eachCreditCard : creditCard) {
		s =  eachCreditCard.toString();
		outChar.println(s);
		}
		outChar.close();
		return true;
		
		
	}

	public boolean storeInCharacters(CreditCard[] creditCard, File file, String path) {
		
		PrintWriter outChar = null;
		String tempPath = file.toString();
		String s = null;
		try {
			outChar = new PrintWriter(new FileWriter(path + "/" + tempPath, true));
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for (CreditCard eachCreditCard : creditCard) {
		s =  eachCreditCard.toString();
		outChar.println(s);
		}
		outChar.close();
		return true;
		
		
	}

	public boolean storeInBytes(CreditCard[] creditCard, File file) {
		
		ObjectOutputStream outStream = null;
		try {
			outStream = new ObjectOutputStream(new FileOutputStream(file));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		try {
			
			outStream.writeObject(creditCard);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}
	
	public boolean storeInBytes(CreditCard[] creditCard, File file, String path) {
		
		ObjectOutputStream outStream = null;
		String tempPath = file.toString();
		try {
			outStream = new ObjectOutputStream(new FileOutputStream(path + "/" + tempPath, false));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		try {
			
			outStream.writeObject(creditCard);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}
	
	public CreditCard[] readFile(File file, int choice) {
		
		CreditCard[] creditCards = new CreditCard[3];
		CreditCard creditCard = null;
		int i = 0;
		if(choice == 0) {


//		
		ObjectInputStream inStream = null;
		
		try {
			inStream = new ObjectInputStream(new FileInputStream(file));
			creditCards = (CreditCard[]) inStream.readObject();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		else {
		BufferedReader in = null;
		String line = null;
		String attributes[] = new String[4];
		try {
			in = new BufferedReader(new FileReader(file));
			
			while ((line = in.readLine()) != null) {
				attributes = line.split(",");
				System.out.println(attributes[0] + attributes[1] + attributes[2] + attributes[3]);
				creditCard = new CreditCard(attributes[0], Long.parseLong(attributes[1].trim()), Double.parseDouble(attributes[2].trim()), Integer.parseInt(attributes[3].trim()));
				creditCards[i] = creditCard;
				i++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}

		}
		return creditCards;
//		return null;
	
	}
	
	public void deleteFile(File file, long cardNumber) {
		
		try {
			FileWriter outChar = new FileWriter(file,true);
			
			outChar.write("");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteFile(File file, String path) {
		
		String tempPath = file.toString();
		try {
			FileWriter outChar = new FileWriter(path + "/" + tempPath);
			
			outChar.write("");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
