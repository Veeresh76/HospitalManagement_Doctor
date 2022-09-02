package com.Mindtree.Doctor.Repository;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Mindtree.Doctor.Entity.Doctor;



@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

	//public List<Doctor> findByVisitedDoctors(Integer id);
	
	//dctr_ched_patl        patient_id
	 @Query(value = "SELECT doctor_checked_patients_id FROM doctor_doctor_checked_patients WHERE visited_doctors_id = ?1", nativeQuery = true)
	  List<Integer> findPatientsTreatedByDoctor(int did);
	
}
