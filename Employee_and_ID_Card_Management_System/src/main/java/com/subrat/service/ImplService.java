package com.subrat.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subrat.entity.Employee;
import com.subrat.repositary.IEmployee;
import com.subrat.repositary.Iidcard;

@Service
public class ImplService implements Iservice {
	@Autowired
	private IEmployee Eserv;
	@Autowired
	private Iidcard Iserv;

	@Override
	public List<Employee> addEmp(List<Employee> e) {
		
		return Eserv.saveAll(e);
	}
	
	@Override
	public List<Employee> viewEmp() {
		
		return Eserv.findAll();
	}

	@Override
	public Optional<Employee> searchById(Long id) {
		
		return Eserv.findById(id);
	}


}
