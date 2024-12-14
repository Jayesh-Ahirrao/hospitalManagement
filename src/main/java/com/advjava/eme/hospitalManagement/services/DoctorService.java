package com.advjava.eme.hospitalManagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.advjava.eme.hospitalManagement.entities.Doctor;
import com.advjava.eme.hospitalManagement.entities.Patient;
import com.advjava.eme.hospitalManagement.repositories.DoctorsRepository;

@Service
public class DoctorService {

	@Autowired
	DoctorsRepository drepo;
	
	public List<Doctor> getAll() {
		return drepo.findAll();
	}
	
}
