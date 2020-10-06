/**
 * 
 */
package com.training.services;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

import com.training.entity.Invoice;

/**
 * @author manan
 *
 */
public class InvoiceService {

	private List<Invoice> invoiceList;

	/**
	 * 
	 */
	public InvoiceService() {
		super();
		
		this.invoiceList = Arrays.asList(new Invoice(101, "Ramesh", 4500), new Invoice(201, "Resh", 14500), new Invoice(301, "Chandu", 9900), new Invoice(205, "Rajesh", 7800), new Invoice(308, "Chandu", 5500));
	}

	/**
	 * @param invoiceList
	 */
	public InvoiceService(List<Invoice> invoiceList) {
		super();
		this.invoiceList = invoiceList;
	}
	
	public Optional<List<Invoice>> filterByName(String name) {
		
		List<Invoice> invList = null;
		
		invList = this.invoiceList.stream().filter( eachInvoice -> eachInvoice.getCustomerName().equals(name)).collect(toList());
		
		Optional<List<Invoice>> optionalList = null;
		
		if (invList.isEmpty()) {
			optionalList = Optional.ofNullable(null);
		} else {
			optionalList = Optional.ofNullable(invList);
		}

		return optionalList;
	}
	
	public Map<Integer, Double> fetchInvoiceDetailsByName(String name) {
		
		Map<Integer, Double> invMap = null;
		
		invMap = this.invoiceList.stream().filter( eachInvoice -> eachInvoice.getCustomerName().equals(name)).collect(toMap(Invoice::getInvoiceNumber, Invoice::getAmount, (invoice1, invoice2) -> invoice1 + invoice2));
		
		return invMap;
	}
	
	public double findMaxAmount() {
		
		double maxAmount = 0;
		
		Comparator<Invoice> amountComparator = Comparator.comparingDouble(Invoice::getAmount);
		
		Optional<Invoice> inv = this.invoiceList.stream().max(amountComparator);
		
		if (inv.isPresent()) {
			maxAmount = inv.get().getAmount();
		}
		return maxAmount;
	}
	
	public long countInvoices(String name) {
		
//		long invListLength = this.invoiceList.stream().filter( eachInvoice -> eachInvoice.getCustomerName().equals(name)).count();
		
		return this.invoiceList.stream().filter( eachInvoice -> eachInvoice.getCustomerName().equals(name)).count();
	}
}
