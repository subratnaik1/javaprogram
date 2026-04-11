package com.subrat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;


import com.subrat.entity.Patient;
import com.subrat.repositary.Irepo;

@Service
public class Serv implements Iservice {
	@Autowired
	private Irepo repo;

	@Override
	public List<Patient> findByDisease(String disease) {
		
		return repo.findByDisease(disease);
	}

	@Override
	public List<Patient> findByAgeGreaterThan(int age) {
		
		return repo.findByAgeGreaterThan(age);
	}

	@Override
	public List<Patient> findByNameContaining(String name) {
		
		return repo.findByNameContaining(name);
	}
	
	public Page<Patient> getPatientByPageAndSort(int page, int size, boolean asc, String... props) {
		
		Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC,props);
		Pageable pageable = PageRequest.of(page, size,sort);
		Page<Patient> all = repo.findAll(pageable);
		return all;
		
	}	
}
