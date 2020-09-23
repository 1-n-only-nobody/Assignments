package com.training;

import com.training.entity.Doctor;
import com.training.entity.Patient;
import com.training.services.HospitalImplementation;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor doctor1 = new Doctor(111, "Manan");
		Doctor doctor2 = new Doctor(222, "Manthan");
		Doctor doctor3 = new Doctor(333, "Chanan");
		Doctor doctor4 = new Doctor(444, "Chagan");
		
		Patient patient1 = new Patient(100, "John");
		Patient patient2 = new Patient(200, "Johnson");
		Patient patient3 = new Patient(300, "Johnton");
		Patient patient4 = new Patient(400, "Johnty");
		Patient patient5 = new Patient(500, "Joe");
		Patient patient6 = new Patient(600, "Johnny");
		
		HospitalImplementation hospitalImplementation = new HospitalImplementation();
		
		System.out.println("creating 3 doctors");
		hospitalImplementation.appointDoctor(doctor1);
		hospitalImplementation.appointDoctor(doctor2);
		hospitalImplementation.appointDoctor(doctor3);
		
		System.out.println("Adding 3 patients to doctor 1");
		hospitalImplementation.createAppoinment(patient1, doctor1);
		hospitalImplementation.createAppoinment(patient2, doctor1);
		hospitalImplementation.createAppoinment(patient3, doctor1);
		
		System.out.println("Adding 2 patients to doctor 2");
		hospitalImplementation.createAppoinment(patient4, doctor2);
		hospitalImplementation.createAppoinment(patient5, doctor2);
		
		System.out.println("Adding 1 patients to doctor 3");
		hospitalImplementation.createAppoinment(patient6, doctor3);
		
		System.out.println("Getting all appointments of doctor 2");
		System.out.println(hospitalImplementation.getAppointments(doctor2));
		
		System.out.println("Cancelling appointment of patient 5 from doctor 1");
		hospitalImplementation.cancelAppointment(doctor1, patient5);
		
		System.out.println("Cancelling appointment of patient 2 from doctor 1");
		hospitalImplementation.cancelAppointment(doctor1, patient2);
		
		System.out.println("Cancelling all appointment of doctor 2");
		hospitalImplementation.cancelAppointmentForDoctor(doctor2);
		
		System.out.println("Trying to add patients to non-existing doctor 4.");
		hospitalImplementation.createAppoinment(patient4, doctor4);
	}

}
