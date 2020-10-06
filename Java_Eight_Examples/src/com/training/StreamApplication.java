package com.training;

import java.util.List;
import java.util.Optional;

import com.training.entity.Invoice;
import com.training.services.InvoiceService;

public class StreamApplication {

	public static void main(String[] args) {

		InvoiceService invoiceService = new InvoiceService();
		
		Optional<List<Invoice>> optionalList = invoiceService.filterByName("Chandu");
		
		if (optionalList.isPresent()) {
			optionalList.get().forEach(System.out::println);
		}
		
		System.out.println(invoiceService.fetchInvoiceDetailsByName("Chandu"));
		
		System.out.println(invoiceService.countInvoices("Chandu"));
		
		System.out.println(invoiceService.findMaxAmount());
		
		Optional<List<Invoice>> optionalList2 = invoiceService.filterByName("Mandu");
		
		if (optionalList2.isPresent()) {
			optionalList2.get().forEach(System.out::println);
		} else {
			System.out.println(optionalList2.orElseThrow( () -> new RuntimeException("Null Value Exception") ));
		}
	}

}
