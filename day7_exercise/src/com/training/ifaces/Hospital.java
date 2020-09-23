/**
 * 
 */
package com.training.ifaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import com.training.entity.Doctor;
import com.training.entity.Patient;

/**
 * @author manan
 *
 */
public interface Hospital {

	String APPNAME = "Sahayadri Hospital Appoinment Management System";
	
//	boolean createPatient(Patient patient);
//	HashMap<Doctor, ArrayList<Patient>> getAllAppointments();
	boolean appointDoctor(Doctor doctor);
	boolean createAppoinment(Patient patient, Doctor doctor);
	boolean cancelAppointmentForDoctor(Doctor doctor);
	ArrayList<Patient> getAppointments(Doctor doctor);
	boolean cancelAppointment(Doctor doctor, Patient patient);
}
