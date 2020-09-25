package com.training;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

import com.training.entity.Invoice;
import com.training.utils.ConnectionUtility;

public class UsingJdbcRowSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Connection con = ConnectionUtility.getDerbyConnection();
		String derbyURL = "jdbc:derby:SampleDB;create=true";
		String sql = null;
		Invoice inv = null;
		
		try {
			CachedRowSet rowSet = RowSetProvider.newFactory().createCachedRowSet();
			
			rowSet.setUrl(derbyURL);
			
			rowSet.setPageSize(2);
			
			sql = "select * from invoice";
			
			rowSet.setCommand(sql);
			
			rowSet.execute();
			
			
			int i = 1;
			do {
				System.out.println("=======Page======= : --> " + i);
			
				while (rowSet.next()) {
					int invoiceNumber = rowSet.getInt("invoiceNumber");
					String customerName = rowSet.getString("customerName");
					double amount = rowSet.getDouble("amount");
				
					inv = new Invoice(invoiceNumber, customerName, amount);
					System.out.println(inv);
				}
				i++;
			} while (rowSet.nextPage());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
