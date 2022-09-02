package com.Mindtree.Doctor.Services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.Mindtree.Doctor.Entity.Doctor;

import com.Mindtree.Doctor.Repository.DoctorRepository;



@Service
public class DoctorService {

	@Autowired
	DoctorRepository doctorRepository;



	public String test() {
		/*	Doctor d1 = new Doctor();
		Doctor d2 = new Doctor();

		d1.setId(101);
		d1.setName("Sharath");
		d1.setAge(23);
		d1.setGender("male");
		d1.setNorPatientsAttended(10);
		d1.setSpecalist("eye");






		d2.setId(102);
		d2.setName("Bharath");
		d2.setAge(25);
		d2.setGender("male");
		d2.setNorPatientsAttended(20);
		d2.setSpecalist("eye");




		Patient p1 = new Patient();
		Patient p2 = new Patient();


		p1.setId(1);
		p1.setName("patient1");
		p1.setDateOfVisit("01/01/2000");


		p2.setId(2);
		p2.setName("patient2");
		p2.setDateOfVisit("02/02/2000");


		List<Doctor> ld1 = new ArrayList<Doctor>();
		List<Patient> lp1 = new ArrayList<Patient>();


		ld1.add(d1);ld1.add(d2);
		lp1.add(p1);lp1.add(p2);


		p2.setVisitedDoctors(ld1);

	//	d2.setDoctorCheckedPatients(lp1);
		//p2.setVisitedDoctors(ld1);

		doctorRepository.save(d1);
		doctorRepository.save(d2);

		patientRepository.save(p1);
		patientRepository.save(p2);*/

		return "done" ;
	}



	public List<Doctor> getAllDoctors() {
		try {
			return doctorRepository.findAll();}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}


	public Doctor addDoctors(Doctor d) {
		try {
			doctorRepository.save(d);}
		catch(Exception e){
			e.printStackTrace();
		}
		return d;
	}


	public Doctor getDoctorById(int id) {
		try {
			return  doctorRepository.findById(id).get();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Patients treated By Doctor                    Doctor id    




}
