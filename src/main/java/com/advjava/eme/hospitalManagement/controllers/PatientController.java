package com.advjava.eme.hospitalManagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.advjava.eme.hospitalManagement.entities.Patient;
import com.advjava.eme.hospitalManagement.services.PatientService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class PatientController {
	@Autowired
	PatientService pservice;

	// 1. done
	@PostMapping("/savePatient")
	public Patient createPatient(@RequestBody Patient patient) {
		return pservice.createPatient(patient);
	}

	// 3. done
	@PutMapping("/updateContact/{id}/{contact}")
	public Patient updateContact(@PathVariable int id, @PathVariable String contact) {
		return pservice.getContact(id, contact);
	}
	
	// 4. done
	@DeleteMapping("/deletePatient/{id}")
	public boolean deletePatient(@PathVariable int id) {
		return pservice.deletePatient(id);
	}
	
	// 5. Done
	@GetMapping("/getPatient/{id}")
	public Patient getPatient(@PathVariable int id) {
		return pservice.getPatient(id);
	}
	
	
	
}