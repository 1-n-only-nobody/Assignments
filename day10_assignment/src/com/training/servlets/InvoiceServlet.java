package com.training.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.daos.InvoiceDaoImpl;
import com.training.entity.Invoice;

/**
 * Servlet implementation class InvoiceServlet
 */
@WebServlet("/InvoiceServlet")
public class InvoiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	InvoiceDaoImpl invoiceDaoImpl = null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InvoiceServlet() {
        super();

        this.invoiceDaoImpl = new InvoiceDaoImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String customerName = request.getParameter("customerName");
		String strInvoiceNumber = request.getParameter("invoiceNumber");
		String strAmount = request.getParameter("amount");
		
		int invoiceNumber = Integer.parseInt(strInvoiceNumber);
		double amount = Double.parseDouble(strAmount);
		
		Invoice invoice = new Invoice(invoiceNumber, customerName, amount);
		
		request.setAttribute("customerName", customerName);
		request.setAttribute("invoiceNumber", invoiceNumber);
		request.setAttribute("amount", amount);
		request.setAttribute("invoiceObject", invoice);
		
		System.out.println(invoice.getCustomerName());
		
		
//		System.out.println(invoice.getInvoiceNumber());
		
		RequestDispatcher dispatcher1 = request.getRequestDispatcher("/success.jsp");
		RequestDispatcher dispatcher2 = request.getRequestDispatcher("/failure.jsp");
		
		
		if(invoiceDaoImpl.add(invoice)) {
			dispatcher1.forward(request, response);
		} else {
			dispatcher2.forward(request, response);
		}
		
		System.out.println(this.invoiceDaoImpl.findById(1234));
		
//		doGet(request, response);
	}

}
