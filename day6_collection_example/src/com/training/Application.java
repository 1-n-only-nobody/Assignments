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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Invoice ram = new Invoice(101, "Ramesh", 4500);
		
		Invoice raj = new Invoice(101, "Rajesh", 5500);
		
		Invoice rak = new Invoice(101, "Rakesh", 5500);
		
		Invoice kam = new Invoice(101, "Kamlesh", 6500);
		
		InvoiceDAO dao = new InvoiceDaoImpl();
		
		dao.add(ram);
		
		dao.add(raj, rak, kam);
		
		Collection<Invoice> invList = dao.findAll();
		
		Iterator<Invoice> iterator = invList.iterator();
		
		while (iterator.hasNext()) {
			Invoice inv = (Invoice) iterator.next();
			
			System.out.println(inv);
		}
	}

}
