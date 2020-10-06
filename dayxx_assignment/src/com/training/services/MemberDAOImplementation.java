/**
 * 
 */
package com.training.services;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.training.entity.Member;
import com.training.ifaces.MemberDAO;
import com.training.utils.ConnectionUtility;

/**
 * @author manan
 *
 */
public class MemberDAOImplementation implements MemberDAO<Member> {

	private List<Member> memberList = null;
	private Connection derbyConnection = null;
	private List<Member> penaltyList = null;
	/**
	 * 
	 */
	public MemberDAOImplementation() {
		
		this.memberList = new ArrayList<Member>();
		this.penaltyList = new ArrayList<Member>();
		this.derbyConnection = ConnectionUtility.getDerbyConnection();
		try {
			DatabaseMetaData dbInfo = this.derbyConnection.getMetaData();
			
			System.out.println("Driver Name : --> " + dbInfo.getDriverName());
			System.out.println("Product Version : --> " + dbInfo.getDatabaseProductVersion());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private Member printResult(ResultSet resultSet) {
		
		Member member = null;
		try {
			long memberId =resultSet.getLong("memberId");
			String memberName = resultSet.getString("memberName");
			Date accountOpeningSQLDate = resultSet.getDate("accountOpeningDate");
			LocalDate accountOpeningDate = accountOpeningSQLDate.toLocalDate();
			String membershipType = resultSet.getString("membershipType");
			double feesPaid = resultSet.getDouble("feesPaid");
			int maxBookAllowed = resultSet.getInt("maxBookAllowed");
			double penaltyAmount = resultSet.getDouble("penaltyAmount");
			
			member = new Member(memberId, memberName, accountOpeningDate, membershipType, feesPaid, maxBookAllowed, penaltyAmount);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return member;
	}

	@Override
	public Collection<Member> findAll() {
		this.memberList.clear();
		
		String sql = "select * from member";
		
		PreparedStatement pstmt = null;
		ResultSet resultSet = null;
		Member member = null;
		try {
			pstmt = this.derbyConnection.prepareStatement(sql);
			resultSet = pstmt.executeQuery();
			ResultSetMetaData metaData = resultSet.getMetaData();
//			int columnCount = metaData.getColumnCount();
//			for (int i = 1; i <= columnCount; i++) {
//				
//				System.out.println("======Column :--> " + metaData.getColumnName(i));
//				
//			}
			
			while(resultSet.next()) {
				
				member = printResult(resultSet);
				
				this.memberList.add(member);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return this.memberList;
	}

	@Override
	public boolean add(Member entity) {
		this.memberList.clear();
		
		String sql = "insert into member values(?,?,?,?,?,?,?)";
		PreparedStatement pstmt = null;
		int rowUpdated = 0;
		
		try {
			pstmt = this.derbyConnection.prepareStatement(sql);
			
			pstmt.setLong(1, entity.getMemberId());
			pstmt.setString(2, entity.getMemberName());
			pstmt.setDate(3, Date.valueOf(entity.getAccountOpeningDate()));
			pstmt.setString(4, entity.getMembershipType());
			pstmt.setDouble(5, entity.getFeesPaid());
			pstmt.setInt(6, entity.getMaxBookAllowed());
			pstmt.setDouble(7, entity.getPenaltyAmount());
			
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
	public boolean remove(long memberId) {
		this.memberList.clear();
		return false;
	}

	@Override
	public boolean update(Member oldEntity, Member updatedEntity) {
		this.memberList.clear();
		return false;
	}

	@Override
	public Member findById(long id) {
		this.memberList.clear();
		return null;
	}

	@Override
	public Collection<Member> getPenaltyList() {
		this.memberList.clear();
		this.penaltyList.clear();
		return null;
	}

}
