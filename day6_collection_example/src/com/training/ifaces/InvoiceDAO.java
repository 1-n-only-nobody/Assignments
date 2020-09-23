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
	Collection<Invoice> sortByInvoiceNumber();
	boolean add(Invoice entity);
	boolean add(Invoice... invoices);
	Invoice findById(int id);
	boolean remove(Invoice entity);
	boolean update(Invoice oldEntity, Invoice newEntity);
	
}
