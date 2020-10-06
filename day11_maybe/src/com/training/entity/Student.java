/**
 * 
 */
package com.training.entity;

/**
 * @author manan
 *
 */
public class Student {

	private String studentName;
	private int studentId;
	private String studentField;
	
	/**
	 * 
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param studentName
	 * @param studentId
	 * @param studentField
	 */
	public Student(String studentName, int studentId, String studentField) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.studentField = studentField;
	}

	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}

	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}

	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	/**
	 * @return the studentField
	 */
	public String getStudentField() {
		return studentField;
	}

	/**
	 * @param studentField the studentField to set
	 */
	public void setStudentField(String studentField) {
		this.studentField = studentField;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((studentField == null) ? 0 : studentField.hashCode());
		result = prime * result + studentId;
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
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
		Student other = (Student) obj;
		if (studentField == null) {
			if (other.studentField != null)
				return false;
		} else if (!studentField.equals(other.studentField))
			return false;
		if (studentId != other.studentId)
			return false;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + ", studentField=" + studentField
				+ "]";
	}
	
	
}
