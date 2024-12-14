package com.advjava.eme.hospitalManagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.advjava.eme.hospitalManagement.entities.Doctor;
import com.advjava.eme.hospitalManagement.entities.Patient;
import com.advjava.eme.hospitalManagement.services.DoctorService;


@RestController
@CrossOrigin(origins = "*")
public class DoctorController  {

	
	@Autowired
	DoctorService dservice;

	// 2. Done
	@GetMapping("/getDoctors")
	public List<Doctor> getAll() {
		return dservice.getAll() ;
	}
	
}


