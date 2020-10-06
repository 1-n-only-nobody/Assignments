/**
 * 
 */
package com.training.services;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

import com.training.entity.Student;

/**
 * @author manan
 *
 */
public class StudentServiceImpl {

	private HashMap<Integer, Student> studentList = null;

	/**
	 * 
	 */
	public StudentServiceImpl() {
		super();
		
		this.studentList = new HashMap<>();
	}
	
	private void init() {
		this.studentList.put(1, new Student(1, "Ramesh"));
		this.studentList.put(2, new Student(2, "Suresh"));
		this.studentList.put(3, new Student(3, "Magnesh"));
	}
	
	public Student findById(int key) {
		init();
		if (this.studentList.get(key) != null) {
			return this.studentList.get(key);
		} else {
			throw new NoSuchElementException("Student Not Found");
		}
	}
	
	public HashMap<Integer,Student> findAll() {
		init();
		return this.studentList;
	}
	
	public Set<Entry<Integer,Student>> findAllasSet() {
		init();
		return this.studentList.entrySet();
	}
}
