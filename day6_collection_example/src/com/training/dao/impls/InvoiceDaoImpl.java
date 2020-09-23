/**
 * 
 */
package com.training.dao.impls;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.training.entity.Invoice;
import com.training.ifaces.InvoiceDAO;
import com.training.utils.AmountComparator;
import com.training.utils.CustomerNameComparator;
import com.training.utils.InvoiceNumberComparator;

/**
 * @author manan
 *
 */
public class InvoiceDaoImpl implements InvoiceDAO {

	private List<Invoice> invList;
	
	
	/**
	 * 
	 */
	public InvoiceDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
		
		this.invList = new ArrayList<Invoice>();
	}

	@Override
	public Collection<Invoice> findAll() {
		// TODO Auto-generated method stub
		
		return this.invList;
	}

	@Override
	public boolean add(Invoice entity) {
		// TODO Auto-generated method stub
		return this.invList.add(entity);
	}

	@Override
	public Invoice findById(int id) {
		// TODO Auto-generated method stub
		for (Invoice eachInvoice : invList) {
			if (eachInvoice.getInvoiceNumber() == id) {
				return eachInvoice;
			}
		}
		
		return null;
	}

	@Override
	public boolean add(Invoice... invoices) {
		// TODO Auto-generated method stub
		boolean result = false;
		for (Invoice eachInvoice : invoices) {
			add(eachInvoice);
			result = true;
		}
		return result;
	}

	@Override
	public boolean remove(Invoice entity) {
		// TODO Auto-generated method stub
		return this.invList.remove(entity);
	}

	@Override
	public boolean update(Invoice oldEntity, Invoice newEntity) {
		// TODO Auto-generated method stub
		int index = 0;
		boolean result = false;
		if(this.invList.contains(oldEntity)) {
			index = this.invList.indexOf(oldEntity);
			this.invList.set(index, newEntity);
			result = true;
		}
		return result;
	}

	@Override
	public Collection<Invoice> sortByInvoiceNumber() {
		// TODO Auto-generated method stub
		Collections.sort(this.invList);
		return this.invList;
	}

	@Override
	public Collection<Invoice> sortBy(String propName) {
		// TODO Auto-generated method stub
		String lowerPropName = propName.toLowerCase();
		switch(lowerPropName) {
		case "customername" :
			CustomerNameComparator customerNameComparator = new CustomerNameComparator();
			Collections.sort(this.invList, customerNameComparator);
			break;
		case "invoicenumber" :
			InvoiceNumberComparator invoiceNumberComparator = new InvoiceNumberComparator();
			Collections.sort(this.invList, invoiceNumberComparator);
			break;
		case "amount" :
			AmountComparator amountComparator = new AmountComparator();
			Collections.sort(this.invList, amountComparator);
			break;
		default:
			System.out.println("Enter a valid field.");
		}
		return this.invList;
	}

}
