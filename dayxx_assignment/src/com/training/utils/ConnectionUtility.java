package com.training.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionUtility {

	public static Connection getDerbyConnection() {
		
		Connection derbyConnection = null;
		
		try {
			String derbyURL = "jdbc:derby:MemberDatabase;create=true";
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
			derbyConnection = DriverManager.getConnection(derbyURL);
//			String createTable = "create table member ( memberId bigint primary key, memberName varchar(255), accountOpeningDate date, membershipType varchar(255), feesPaid double, maxBookAllowed int, penaltyAmount double)";
//			if (derbyConnection != null) {
//				System.out.println("Connection Established");
//			}
//			PreparedStatement pstmt = derbyConnection.prepareStatement(createTable);
//			pstmt.execute();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return derbyConnection;
	}
}
