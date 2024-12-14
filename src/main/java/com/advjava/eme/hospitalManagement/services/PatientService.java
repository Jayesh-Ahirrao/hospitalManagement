package com.advjava.eme.hospitalManagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advjava.eme.hospitalManagement.entities.Patient;
import com.advjava.eme.hospitalManagement.repositories.PatientRepository;

@Service
public class PatientService {

	@Autowired
	PatientRepository prepo;

	public List<Patient> getAll() {
		return prepo.findAll();
	}

	public Patient createPatient(Patient patient) {
		return prepo.save(patient);
	}

	public Patient getContact(int id, String contact) {
		Patient p = prepo.getOne(id);
		p.setContact(contact);
		return prepo.save(p);
	}

	public boolean deletePatient(int id) {
		prepo.deleteById(id);
		return true;
	}

	public Patient getPatient(int pid)
	{
		return prepo.findById(pid).get();
	}

}
