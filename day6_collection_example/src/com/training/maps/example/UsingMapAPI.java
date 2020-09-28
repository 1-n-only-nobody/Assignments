package com.training.maps.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.training.entity.Invoice;

public class UsingMapAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Invoice ram = new Invoice(101, "Ramesh", 4500);
		
		Invoice ram2 = new Invoice(101, "Ramesh", 4500);
		
		Invoice raj = new Invoice(102, "Rajesh", 7000);
		
		Invoice rak = new Invoice(103, "Rakesh", 9000);
		
		Invoice kam = new Invoice(104, "Kamlesh", 6500);
		
		HashMap<Integer, Invoice> invList = new HashMap<Integer, Invoice>();
		
		//AutoBoxing --> we do not need to manually convert primitive to object.
		//No need for invList.put(new Integer(901), ram);
		invList.put(901, ram);
		invList.put(902, ram2);
		Invoice response = invList.put(902, raj);
		invList.put(903, rak);
		invList.put(904, kam);
		
		System.out.println(response);
		
		System.out.println("Size : " + invList.size());
		
		System.out.println(invList.get(904));
		
		//Transforming a HashMap into a Set using entrySet() method.
		Set<Map.Entry<Integer, Invoice>> mylist = invList.entrySet();
		
		for (Map.Entry<Integer, Invoice> eachEntry : mylist) {
			
			System.out.println(eachEntry.getKey());
			System.out.println(eachEntry.getValue());
		}
	}

}
