package com.training.second;

import java.io.File;

import com.training.model.CreditCard;
import com.training.services.BusinessService;

public class CreditApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreditCard creditCard[] = new CreditCard[3];
		CreditCard newcreditCard[] = new CreditCard[3];
		
		CreditCard creditCard1 = new CreditCard("Abcd", 123456, 5000.00, 145);
		CreditCard creditCard2 = new CreditCard("Bcde", 234567, 6000.00, 458);
		CreditCard creditCard3 = new CreditCard("Cdef", 345678, 7000.00, 582);
		creditCard[0] = creditCard1;
		creditCard[1] = creditCard2;
		creditCard[2] = creditCard3;
		
		BusinessService service = new BusinessService();
		
		System.out.println("Enter file name: ");
		File file = new File("abc.txt");
//		System.out.println(file.toString());
		System.out.println("Enter path to file : ");
		String path = "D:/AddToROG/";
//		service.storeInCharacters(creditCard, file);
//		service.storeInBytes(creditCard, file);
		service.deleteFile(file, 123456);
//		CreditCard creditCard4 = service.readFromFile(file, 1, 123456);
//		System.out.println(creditCard4);
		
	}

}
