package com.advjava.eme.hospitalManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.advjava.eme.hospitalManagement.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}