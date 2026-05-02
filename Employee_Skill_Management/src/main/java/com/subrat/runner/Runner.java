package com.subrat.runner;

import com.subrat.repositary.EmpRepos;
import com.subrat.repositary.SkillsRepo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.subrat.Service.Iservice;
import com.subrat.entity.Employee;
import com.subrat.entity.Skills;

@Component
public class Runner implements CommandLineRunner {
	
	@Autowired
	private Iservice serv;

	@Override
	public void run(String... args) throws Exception {

		while (true) {

			System.out.println("1-Add employees & skills");
			System.out.println("2-View employees with skills");
			System.out.println("3-Delete employee/skill");

			int choice = Integer.parseInt(IO.readln("enter your choice"));

			switch (choice) {
			case 1 -> {

				List<Employee> empList = new ArrayList<>();
				int emp = Integer.parseInt(IO.readln("enter how many employees u want to add"));
				int ski = Integer.parseInt(IO.readln("enter how many Skills u want to add"));

				for (int i = 0; i <= emp; i++) {
					String empName = IO.readln("enter name");
					Employee e = new Employee(empName);

					List<Skills> skillList = new ArrayList<>();
					for (int j = 0; j <= ski; j++) {
						String skillName = IO.readln("enter Skills name");
						Skills s = new Skills(skillName);
						s.setEmployees(List.of(e));
						skillList.add(s);
					}
					e.setSkills(skillList);
					empList.add(e);
					serv.addEmployeeAndSkills(empList);
				}
				IO.println("employee added ");
			}
			case 2 -> {
				List<Employee> showAllEmployeeWithSkills = serv.showEmployees();
				showAllEmployeeWithSkills.forEach(e->{
					List<Skills> list = e.getSkills();
					IO.println(e.getEmpId()+" "+e.getEmpName()+" "+list);
				});
			}
			case 3->{
				Long id=Long.parseLong(IO.readln("enter id"));
				IO.println(serv.deleteEmpWithList(id));
			}
			}
		}
	}

}
