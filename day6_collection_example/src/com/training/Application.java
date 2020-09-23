/**
 * 
 */
package com.training;

import java.util.Collection;
import java.util.Iterator;

import com.training.dao.impls.InvoiceDaoImpl;
import com.training.entity.Invoice;
import com.training.ifaces.InvoiceDAO;

/**
 * @author manan
 *
 */
public class Application {

	
	public static void printList(Collection<Invoice> invList) {
		
		Iterator<Invoice> iterator = invList.iterator();
		
		while (iterator.hasNext()) {
			Invoice inv = (Invoice) iterator.next();
			
			System.out.println(inv);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Invoice ram = new Invoice(101, "Ramesh", 4500);
		
		Invoice raj = new Invoice(102, "Rajesh", 7000);
		
		Invoice rak = new Invoice(103, "Rakesh", 9000);
		
		Invoice kam = new Invoice(104, "Kamlesh", 6500);
		
		InvoiceDAO dao = new InvoiceDaoImpl();
		
		dao.add(ram);
		
		dao.add(raj, rak, kam);
		
		Collection<Invoice> invList = dao.findAll();
		
		printList(invList);
		
		dao.remove(kam);
		
		System.out.println("After removal");
		printList(invList);
		
		dao.update(raj, kam);
		System.out.println("After update.");
		printList(invList);
		
		System.out.println("find by id.");
		Invoice invoice = dao.findById(101);
		System.out.println(invoice);
		
		System.out.println("Sorted List");
		
		printList(dao.sortByInvoiceNumber());
		
		System.out.println("Sort by name");
		
		printList(dao.sortBy("CustomerName"));
		
		System.out.println("Sort by invoiceNumber");
		
		printList(dao.sortBy("InvoiceNumber"));
		
		System.out.println("Sort by amount");
		
		printList(dao.sortBy("Amount"));
	}

}
