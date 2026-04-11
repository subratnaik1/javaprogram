package com.subrat.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.subrat.entity.Patient;
@Repository
public interface Irepo extends JpaRepository<Patient, Integer> {

	List<Patient> findByDisease(String disease);

	List<Patient>findByAgeGreaterThan(int age);

	List<Patient>findByNameContaining(String name);


}
