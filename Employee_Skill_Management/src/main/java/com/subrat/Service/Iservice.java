package com.subrat.Service;

import java.util.List;
import java.util.Optional;

import com.subrat.entity.Employee;

public interface Iservice {

	List<Employee> addEmployeeAndSkills(List<Employee> e);

	List<Employee> showEmployees();
	
	String deleteEmpWithList(Long id);
}
