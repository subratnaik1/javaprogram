package com.subrat.service;

import java.util.List;
import java.util.Optional;

import com.subrat.entity.Employee;

public interface Iservice {
	List<Employee> addEmp(List<Employee> e);

	List<Employee> viewEmp();

	Optional<Employee> searchById(Long id);
}
