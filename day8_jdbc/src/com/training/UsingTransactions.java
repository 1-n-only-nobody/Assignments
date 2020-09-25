package com.training;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Savepoint;

import com.training.utils.ConnectionUtility;

public class UsingTransactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = ConnectionUtility.getDerbyConnection();
		String sqlOne = null;
		String sqlTwo = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.PreparedStatement pstmt2 = null;
		Savepoint point1 = null;
		
		try {
			con.setAutoCommit(false);
			
			sqlOne = "insert into invoice values(?,?,?)";
			sqlTwo = "insert into invoice values(?,?,?)";
			
			pstmt = con.prepareStatement(sqlOne);
				
			pstmt.setInt(1, 1099);
			pstmt.setString(2, "Kaled");
			pstmt.setDouble(3, 49449);
				
			pstmt.executeUpdate();
			
			point1 = con.setSavepoint("point1");
			
			pstmt2 = con.prepareStatement(sqlTwo);
				
			pstmt2.setInt(1, 999);
			pstmt2.setString(2, "Loke");
			pstmt2.setDouble(3, 5949);
				
			pstmt2.executeUpdate();
			
			con.commit();
			
		} catch (SQLException e) {
			try {
				con.rollback(point1);
				System.out.println("ROLLBACK");
				con.commit();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
//				e1.printStackTrace();
			}
//			e.printStackTrace();
		}
	}

}
