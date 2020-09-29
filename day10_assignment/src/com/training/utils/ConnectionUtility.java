package com.training.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtility {

	public static Connection getDerbyConnection() {
		
		Connection derbyConnection = null;
		
		try {
			String derbyURL = "jdbc:derby:SampleDatabase;create=true";
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
			derbyConnection = DriverManager.getConnection(derbyURL);
			
			if (derbyConnection != null) {
				System.out.println("Connection Established");
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.getMessage();
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
