package com.advjava.eme.hospitalManagement.repositories;

import com.advjava.eme.hospitalManagement.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorsRepository extends JpaRepository<Doctor, Integer>  {

}
