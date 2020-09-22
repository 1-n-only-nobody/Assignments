/**
 * 
 */
package com.training.dao.impls;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.training.entity.Invoice;
import com.training.ifaces.InvoiceDAO;

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

}
