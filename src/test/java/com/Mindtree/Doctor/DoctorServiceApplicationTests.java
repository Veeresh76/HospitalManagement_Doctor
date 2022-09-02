package com.Mindtree.Doctor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.Mindtree.Doctor.Repository.DoctorRepository;




@SpringBootTest
class DoctorServiceApplicationTests {

	@Autowired
	DoctorRepository doctorRepository;
	
	@Test
	void contextLoads() {
		
	}

	@Test
	void getAllPatients() {
		List ll = doctorRepository.findAll();
		assertNotEquals(ll.size(), 0);
	}
	
}
