/**
 * 
 */
package com.training.services;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.training.entity.MarkList;
import com.training.entity.Student;
import com.training.ifaces.BusinessInterface;

/**
 * @author manan
 *
 */
public class BusinessService implements BusinessInterface {

	List<Student> students = null;
	List<MarkList> studentMarks = null;

	/**
	 * 
	 */
	public BusinessService() {
		super();
		this.students = new ArrayList<Student>();
		this.studentMarks = new ArrayList<MarkList>();
	}

	@Override
	public boolean addStudent(Student student) {
		
		if(this.students.add(student)) {
			return true;
		}
		return false;
	}

	@Override
	public List<Student> getStudents() {
		
		return this.students;
	}

	@Override
	public MarkList getMarks(Student student) {
		ListIterator<MarkList> markListIterator = this.studentMarks.listIterator();
		while (markListIterator.hasNext()) {
			MarkList tempMarkList = (MarkList) markListIterator.next();
			if (tempMarkList.getStudent() == student) {
				return tempMarkList;
			}
		}
		return null;
	}

	@Override
	public boolean addMarks(MarkList markList) {
		
		if(this.studentMarks.add(markList)) {
			return true;
		}
		return false;
	}
	
	
}
