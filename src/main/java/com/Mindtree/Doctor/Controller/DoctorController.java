package com.Mindtree.Doctor.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Mindtree.Doctor.Entity.Doctor;
import com.Mindtree.Doctor.Services.DoctorService;
@CrossOrigin
@RestController
public class DoctorController {

	@Autowired
	DoctorService doctorService;
	
	
    
	@PostMapping("/addDoctor")
	public ResponseEntity<Doctor> addDoctor(@RequestBody Doctor d) {
		return new ResponseEntity<Doctor>( doctorService.addDoctors(d),HttpStatus.OK);
	}
	
	@GetMapping("/Doctor/{id}")
	public ResponseEntity<Doctor> DoctorById(@PathVariable ("id") int id) {
		return new ResponseEntity<Doctor>(doctorService.getDoctorById(id),HttpStatus.OK);
	}
	
	@GetMapping("/allDoctors")
	public ResponseEntity<List<Doctor>> allDoctors() {
		return new ResponseEntity( doctorService.getAllDoctors(),HttpStatus.OK);
	}
	
}
