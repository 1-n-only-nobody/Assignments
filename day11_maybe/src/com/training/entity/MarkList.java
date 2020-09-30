/**
 * 
 */
package com.training.entity;

/**
 * @author manan
 *
 */
public class MarkList {

	private int mathMarks;
	private int phyMarks;
	private int chemMarks;
	private int engMarks;
	private Student student;
	
	/**
	 * 
	 */
	public MarkList() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param mathMarks
	 * @param phyMarks
	 * @param chemMarks
	 * @param engMarks
	 * @param student
	 */
	public MarkList(int mathMarks, int phyMarks, int chemMarks, int engMarks, Student student) {
		super();
		this.mathMarks = mathMarks;
		this.phyMarks = phyMarks;
		this.chemMarks = chemMarks;
		this.engMarks = engMarks;
		this.student = student;
	}
	/**
	 * @return the mathMarks
	 */
	public int getMathMarks() {
		return mathMarks;
	}
	/**
	 * @param mathMarks the mathMarks to set
	 */
	public void setMathMarks(int mathMarks) {
		this.mathMarks = mathMarks;
	}
	/**
	 * @return the phyMarks
	 */
	public int getPhyMarks() {
		return phyMarks;
	}
	/**
	 * @param phyMarks the phyMarks to set
	 */
	public void setPhyMarks(int phyMarks) {
		this.phyMarks = phyMarks;
	}
	/**
	 * @return the chemMarks
	 */
	public int getChemMarks() {
		return chemMarks;
	}
	/**
	 * @param chemMarks the chemMarks to set
	 */
	public void setChemMarks(int chemMarks) {
		this.chemMarks = chemMarks;
	}
	/**
	 * @return the engMarks
	 */
	public int getEngMarks() {
		return engMarks;
	}
	/**
	 * @param engMarks the engMarks to set
	 */
	public void setEngMarks(int engMarks) {
		this.engMarks = engMarks;
	}
	/**
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}
	/**
	 * @param student the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + chemMarks;
		result = prime * result + engMarks;
		result = prime * result + mathMarks;
		result = prime * result + phyMarks;
		result = prime * result + ((student == null) ? 0 : student.hashCode());
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
		MarkList other = (MarkList) obj;
		if (chemMarks != other.chemMarks)
			return false;
		if (engMarks != other.engMarks)
			return false;
		if (mathMarks != other.mathMarks)
			return false;
		if (phyMarks != other.phyMarks)
			return false;
		if (student == null) {
			if (other.student != null)
				return false;
		} else if (!student.equals(other.student))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MarkList [mathMarks=" + mathMarks + ", phyMarks=" + phyMarks + ", chemMarks=" + chemMarks
				+ ", engMarks=" + engMarks + ", student=" + student + "]";
	}
	
	
}
