package com.training;

import com.training.daos.InvoiceDaoImpl;
import com.training.entity.Invoice;
import com.training.ifaces.InvoiceDAO;
import com.training.utils.ConnectionUtility;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println(ConnectionUtility.getDerbyConnection());
		
		Invoice invoice = new Invoice(123, "Manan", 5000.0);
		Invoice invoice2 = new Invoice(892, "Mad", 7000.0);
//		
		InvoiceDAO dao = new InvoiceDaoImpl();
//		
//		boolean checkIfAdded = dao.add(invoice);
//		
//		if (checkIfAdded) {
//			System.out.println("ROW ADDED!");
//		}
//		
		System.out.println(dao.findAll());
//		dao.findAll().clear();
//		boolean checkIfRemoved = dao.remove(invoice);
//		
//		if (checkIfRemoved) {
//			System.out.println("ROW REMOVED!");
//		}
//		System.out.println(dao.findAll());
		System.out.println(dao.findById(1099));
		
//		boolean checkIfUpdated = dao.update(invoice, invoice2);
//		
//		if (checkIfUpdated) {
//			System.out.println("ROW UPDATED!");
//		}
		
//		System.out.println(dao.findAll());
//		dao.findAll().clear();
		
//		System.out.println(dao.sortByInvoiceNumber());
	}

}
