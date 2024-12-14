package com.advjava.eme.hospitalManagement.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;

	@Column
	private String fname;

	@Column
	private String lname;

	@Column
	private String address;

	@Column
	private String contact;

	@JsonIgnoreProperties("patients")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "doctor_id")
	private Doctor did;

	public Patient() {
	}

	public Patient(int pid, String fname, String lname, String address, String contact, Doctor did) {
		super();
		this.pid = pid;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.contact = contact;
		this.did = did;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Doctor getDid() {
		return did;
	}

	public void setDid(Doctor did) {
		this.did = did;
	}

	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", fname=" + fname + ", lname=" + lname + ", address=" + address + ", contact="
				+ contact + ", did=" + did + "]";
	}
}
