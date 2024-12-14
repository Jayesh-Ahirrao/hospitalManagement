package com.advjava.eme.hospitalManagement.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="doctor")
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int doctor_id;

	@Column
	private String name;

	@Column
	private String degree;

	@Column
	private String specialization;
	
	@Column
	private Integer	 experience;

	@JsonIgnoreProperties("did")
	@OneToMany(mappedBy = "did",cascade = CascadeType.ALL)
	private List<Patient> patients;

	public int getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	@Override
	public String toString() {
		return "Doctor [doctor_id=" + doctor_id + ", name=" + name + ", degree=" + degree + ", specialization="
				+ specialization + ", experience=" + experience + ", patients=" + patients + "]";
	}

	public Doctor(int doctor_id, String name, String degree, String specialization, Integer experience,
			List<Patient> patients) {
		super();
		this.doctor_id = doctor_id;
		this.name = name;
		this.degree = degree;
		this.specialization = specialization;
		this.experience = experience;
		this.patients = patients;
	}

	public Doctor() {
	}
}
