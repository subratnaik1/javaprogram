package com.subrat.service;

import java.util.List;

import org.springframework.data.domain.Page;


import com.subrat.entity.Patient;

public interface Iservice {
	List<Patient> findByDisease(String disease);

	List<Patient> findByAgeGreaterThan(int age);

	List<Patient> findByNameContaining(String name);

	Page<Patient> getPatientByPageAndSort(int page, int size, boolean asc, String... props);

	
}
