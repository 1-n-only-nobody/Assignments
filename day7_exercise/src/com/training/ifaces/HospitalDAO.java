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
public interface HospitalDAO {

	String APPNAME = "Sahayadri Hospital Appoinment Management System";
	
//	boolean createPatient(Patient patient);
//	HashMap<Doctor, ArrayList<Patient>> getAllAppointments();
	boolean appointDoctor(Doctor doctor);
	boolean createAppoinment(Patient patient, Doctor doctor) throws Exception;
	boolean cancelAppointmentForDoctor(Doctor doctor);
	ArrayList<Patient> getAppointments(Doctor doctor) throws Exception;
	boolean cancelAppointment(Doctor doctor, Patient patient) throws Exception;
}
