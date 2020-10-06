/**
 * 
 */
package com.training.ifaces;

import java.util.List;

import com.training.entity.MarkList;
import com.training.entity.Student;

/**
 * @author manan
 *
 */
public interface BusinessInterface {
	
	boolean addStudent(Student student);
	List<Student> getStudents();
	boolean addMarks(MarkList markList);
	MarkList getMarks(Student student);
	
}
