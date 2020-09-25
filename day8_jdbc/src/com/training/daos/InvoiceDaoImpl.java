/**
 * 
 */
package com.training.daos;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.apache.derby.iapi.sql.PreparedStatement;

import com.training.entity.Invoice;
import com.training.ifaces.InvoiceDAO;
import com.training.utils.AmountComparator;
import com.training.utils.ConnectionUtility;
import com.training.utils.CustomerNameComparator;
import com.training.utils.InvoiceNumberComparator;

/**
 * @author manan
 *
 */
public class InvoiceDaoImpl implements InvoiceDAO {

	private List<Invoice> invList;
	private Connection derbyConnection;
	
	/**
	 * 
	 */
	public InvoiceDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
		
		this.invList = new ArrayList<Invoice>();
		this.derbyConnection = ConnectionUtility.getDerbyConnection();
	}

	private Invoice printResult(ResultSet result) {
		
		Invoice inv = null;
		try {
			int invoiceNumber = result.getInt("invoiceNumber");
			String customerName = result.getString("customerName");
			double amount = result.getDouble("amount");
			
			inv = new Invoice(invoiceNumber, customerName, amount);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return inv;
	}
	@Override
	public Collection<Invoice> findAll() {
		// TODO Auto-generated method stub
		invList.clear();
		String sql = "select * from invoice";
		
		java.sql.PreparedStatement pstmt = null;
		ResultSet result = null;
		Invoice inv = null;
		
		try {
			pstmt = this.derbyConnection.prepareStatement(sql);
			
			result = pstmt.executeQuery();
			
			ResultSetMetaData metaData = result.getMetaData();
			
			int columnCount = metaData.getColumnCount();
			
			for (int i = 1; i <= columnCount; i++) {
				
				System.out.println("======Column :--> " + metaData.getColumnName(i));
				
			}
			
			DatabaseMetaData dbInfo = this.derbyConnection.getMetaData();
			
			System.out.println("Driver Name : --> " + dbInfo.getDriverName());
			System.out.println("Product Version : --> " + dbInfo.getDatabaseProductVersion());
			
			while(result.next()) {
				
				inv = printResult(result);
				
				this.invList.add(inv);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return this.invList;
	}

	@Override
	public boolean add(Invoice entity) {
		// TODO Auto-generated method stub
		String sql = "insert into invoice values(?,?,?)";
		java.sql.PreparedStatement pstmt = null;
		int rowUpdated = 0;
		
		try {
			pstmt = this.derbyConnection.prepareStatement(sql);
			
			pstmt.setInt(1, entity.getInvoiceNumber());
			pstmt.setString(2, entity.getCustomerName());
			pstmt.setDouble(3, entity.getAmount());
			
			rowUpdated = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return rowUpdated == 1 ? true : false;
	}

	@Override
	public Invoice findById(int id) {
		// TODO Auto-generated method stub
		invList.clear();
		String sql = "select * from invoice where invoiceNumber = ?";
		
		java.sql.PreparedStatement pstmt = null;
		
		ResultSet result = null;
		
		Invoice inv = null;
		
		try {
			pstmt = this.derbyConnection.prepareStatement(sql);
			
			pstmt.setInt(1, id);
			
			result = pstmt.executeQuery();
			
			while(result.next()) {
				
				inv = printResult(result);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		for (Invoice eachInvoice : invList) {
//			if (eachInvoice.getInvoiceNumber() == id) {
//				return eachInvoice;
//			}
//		}
		
		return inv;
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
		String sql = "delete from invoice where invoiceNumber = ?";
		
		java.sql.PreparedStatement pstmt = null;
		
		int result = 0;
		
		Invoice inv = null;
		
		try {
			pstmt = this.derbyConnection.prepareStatement(sql);
			
			pstmt.setInt(1, entity.getInvoiceNumber());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result == 1 ? true : false;
	}

	@Override
	public boolean update(Invoice oldEntity, Invoice newEntity) {
		// TODO Auto-generated method stub
//		int index = 0;
		int result = 0;
		String sql = "update invoice set invoiceNumber = ? , customerName = ? , amount = ? where invoiceNumber = ?";
		
		java.sql.PreparedStatement pstmt = null;
		
		Invoice inv = null;
		
		try {
			pstmt = this.derbyConnection.prepareStatement(sql);
			
			pstmt.setInt(1, newEntity.getInvoiceNumber());
			pstmt.setString(2, newEntity.getCustomerName());
			pstmt.setDouble(3, newEntity.getAmount());
			
			pstmt.setInt(4, oldEntity.getInvoiceNumber());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		if(this.invList.contains(oldEntity)) {
//			index = this.invList.indexOf(oldEntity);
//			this.invList.set(index, newEntity);
//			result = true;
//		}
		return result == 1 ? true : false;
	}

	@Override
	public Collection<Invoice> sortByInvoiceNumber() {
		// TODO Auto-generated method stub
		
		this.invList = (List<Invoice>) findAll();
		Collections.sort(this.invList);
		
		
		return this.invList;
//		return this.invList;
	}

	@Override
	public Collection<Invoice> sortBy(String propName) {
		// Try and use a different factory method to do this.
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
