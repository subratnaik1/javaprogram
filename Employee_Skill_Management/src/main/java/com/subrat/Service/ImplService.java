package com.subrat.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subrat.entity.Employee;
import com.subrat.repositary.EmpRepos;
import com.subrat.repositary.SkillsRepo;

@Service
public class ImplService implements Iservice {
	@Autowired
	private EmpRepos Erep;
	@Autowired
	private SkillsRepo Srepo;

	@Override
	public List<Employee> addEmployeeAndSkills(List<Employee> e) {

		return Erep.saveAll(e);
	}

	@Override
	public List<Employee> showEmployees() {
		
		return Erep.findAll();
	}

	@Override
	public String deleteEmpWithList(Long id) {
		Erep.deleteById(id);
		return "employee deleted";
	}

}
