/**
 * 
 */
package com.training.ifaces;

import java.util.Collection;

import com.training.entity.Invoice;

/**
 * @author manan
 *
 */
public interface InvoiceDAO {

	Collection<Invoice> findAll();
	boolean add(Invoice entity);
	boolean add(Invoice... invoices);
	Invoice findById(int id);
	public boolean remove(Invoice entity);
	
}
