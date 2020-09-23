/**
 * 
 */
package com.training.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.training.entity.Doctor;
import com.training.entity.Patient;
import com.training.ifaces.Hospital;

/**
 * @author manan
 *
 */
public class HospitalImplementation implements Hospital {

	private HashMap<Doctor, ArrayList<Patient>> appointments = new HashMap<Doctor, ArrayList<Patient>>();
	
	boolean exists(Doctor doctor) {
		Set<Doctor> tempDoctors = appointments.keySet();
		for (Doctor eachDoctor : tempDoctors) {
			if (doctor.equals(eachDoctor)) {
				return true;
			}
		}
		return false;
		
	}
	@Override
	public boolean createAppoinment(Patient patient, Doctor doctor) {
		
		if (this.exists(doctor)) {
			ArrayList<Patient> tempPatientList = new ArrayList<>();
			if (appointments.get(doctor) == null) {
				
				tempPatientList.add(patient);
			} else {
				tempPatientList = appointments.get(doctor);
				tempPatientList.add(patient);
			}
			appointments.put(doctor, tempPatientList);
			System.out.println(tempPatientList);
			System.out.println(appointments);
			return true;
		}else {
			System.out.println("Doctor does not exist.");
			return false;
		}
		
		
	}

	@Override
	public ArrayList<Patient> getAppointments(Doctor doctor) {
		// TODO Auto-generated method stub
		if (this.exists(doctor)) {
			return appointments.get(doctor);
		}else {
			System.out.println("Doctor does not exist.");
			return null;
		}
	}

	@Override
	public boolean cancelAppointment(Doctor doctor, Patient patient) {
		// TODO Auto-generated method stub
		if (this.exists(doctor)) {
			ArrayList<Patient> tempPatientList = new ArrayList<>();
			if (appointments.get(doctor) == null) {
//				tempPatientList.add(patient);
				System.out.println("You do not have an appointment.");
			} else {
				tempPatientList = appointments.get(doctor);
//				tempPatientList.add(patient);
				if(tempPatientList.remove(patient)) {
					System.out.println("Successfully removed appointment");
				} else {
					System.out.println("You do not have an appointment.");
				}
				appointments.put(doctor, tempPatientList);
				System.out.println(tempPatientList);
				return true;
			} 
		}
		else {
			System.out.println("Doctor does not exist.");
			return false;
		}
		return false;
		
	}

	@Override
	public boolean appointDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		ArrayList<Patient> tempPatientList = new ArrayList<>();
		tempPatientList = appointments.put(doctor, null);
		if (tempPatientList != null) {
			System.out.println("Doctor already exists.");
			appointments.put(doctor, tempPatientList);
			return false;
		}
//		System.out.println(appointments);
		return true;
	}


	@Override
	public boolean cancelAppointmentForDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		appointments.remove(doctor);
		System.out.println(appointments);
		return true;
	}
	

	
}
