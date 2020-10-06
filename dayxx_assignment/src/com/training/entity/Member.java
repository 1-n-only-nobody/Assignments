/**
 * 
 */
package com.training.entity;

import java.time.LocalDate;

/**
 * @author manan
 *
 */
public class Member implements Comparable<Member>{

	private long memberId;
	private String memberName;
	private LocalDate accountOpeningDate;
	private String membershipType;
	private double feesPaid;
	private int maxBookAllowed;
	private double penaltyAmount;
//	create table member ( memberId bigint primary key, memberName varchar(255), accountOpeningDate date, membershipType varchar(255), feesPaid double, maxBookAllowed int, penaltyAmount double);
	/**
	 * 
	 */
	public Member() {
		super();
		this.penaltyAmount = 0;
	}

	/**
	 * @param memberId
	 * @param memberName
	 * @param accountOpeningDate
	 * @param membershipType
	 * @param feesPaid
	 * @param maxBookAllowed
	 */
	public Member(long memberId, String memberName, LocalDate accountOpeningDate, String membershipType,
			double feesPaid, int maxBookAllowed) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.accountOpeningDate = accountOpeningDate;
		this.membershipType = membershipType;
		this.feesPaid = feesPaid;
		this.maxBookAllowed = maxBookAllowed;
		this.penaltyAmount = 0;
	}

	/**
	 * @param memberId
	 * @param memberName
	 * @param accountOpeningDate
	 * @param membershipType
	 * @param feesPaid
	 * @param maxBookAllowed
	 * @param penaltyAmount
	 */
	public Member(long memberId, String memberName, LocalDate accountOpeningDate, String membershipType,
			double feesPaid, int maxBookAllowed, double penaltyAmount) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.accountOpeningDate = accountOpeningDate;
		this.membershipType = membershipType;
		this.feesPaid = feesPaid;
		this.maxBookAllowed = maxBookAllowed;
		this.penaltyAmount = penaltyAmount;
	}

	/**
	 * @return the memberId
	 */
	public long getMemberId() {
		return memberId;
	}

	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}

	/**
	 * @return the memberName
	 */
	public String getMemberName() {
		return memberName;
	}

	/**
	 * @param memberName the memberName to set
	 */
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	/**
	 * @return the accountOpeningDate
	 */
	public LocalDate getAccountOpeningDate() {
		return accountOpeningDate;
	}

	/**
	 * @param accountOpeningDate the accountOpeningDate to set
	 */
	public void setAccountOpeningDate(LocalDate accountOpeningDate) {
		this.accountOpeningDate = accountOpeningDate;
	}

	/**
	 * @return the membershipType
	 */
	public String getMembershipType() {
		return membershipType;
	}

	/**
	 * @param membershipType the membershipType to set
	 */
	public void setMembershipType(String membershipType) {
		this.membershipType = membershipType;
	}

	/**
	 * @return the feesPaid
	 */
	public double getFeesPaid() {
		return feesPaid;
	}

	/**
	 * @param feesPaid the feesPaid to set
	 */
	public void setFeesPaid(double feesPaid) {
		this.feesPaid = feesPaid;
	}

	/**
	 * @return the maxBookAllowed
	 */
	public int getMaxBookAllowed() {
		return maxBookAllowed;
	}

	/**
	 * @param maxBookAllowed the maxBookAllowed to set
	 */
	public void setMaxBookAllowed(int maxBookAllowed) {
		this.maxBookAllowed = maxBookAllowed;
	}

	/**
	 * @return the penaltyAmount
	 */
	public double getPenaltyAmount() {
		return penaltyAmount;
	}

	/**
	 * @param penaltyAmount the penaltyAmount to set
	 */
	public void setPenaltyAmount(double penaltyAmount) {
		this.penaltyAmount = penaltyAmount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountOpeningDate == null) ? 0 : accountOpeningDate.hashCode());
		long temp;
		temp = Double.doubleToLongBits(feesPaid);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + maxBookAllowed;
		result = prime * result + (int) (memberId ^ (memberId >>> 32));
		result = prime * result + ((memberName == null) ? 0 : memberName.hashCode());
		result = prime * result + ((membershipType == null) ? 0 : membershipType.hashCode());
		temp = Double.doubleToLongBits(penaltyAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (accountOpeningDate == null) {
			if (other.accountOpeningDate != null)
				return false;
		} else if (!accountOpeningDate.equals(other.accountOpeningDate))
			return false;
		if (Double.doubleToLongBits(feesPaid) != Double.doubleToLongBits(other.feesPaid))
			return false;
		if (maxBookAllowed != other.maxBookAllowed)
			return false;
		if (memberId != other.memberId)
			return false;
		if (memberName == null) {
			if (other.memberName != null)
				return false;
		} else if (!memberName.equals(other.memberName))
			return false;
		if (membershipType == null) {
			if (other.membershipType != null)
				return false;
		} else if (!membershipType.equals(other.membershipType))
			return false;
		if (Double.doubleToLongBits(penaltyAmount) != Double.doubleToLongBits(other.penaltyAmount))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + ", accountOpeningDate="
				+ accountOpeningDate + ", membershipType=" + membershipType + ", feesPaid=" + feesPaid
				+ ", maxBookAllowed=" + maxBookAllowed + ", penaltyAmount=" + penaltyAmount + "]";
	}

	@Override
	public int compareTo(Member tempMember) {
		
		if (this.penaltyAmount < tempMember.penaltyAmount) return -1;
		if (this.penaltyAmount > tempMember.penaltyAmount) return 1;
		return 0;
	}

	

}
