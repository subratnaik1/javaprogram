package com.subrat.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subrat.entity.Employee;

public interface EmpRepos extends JpaRepository<Employee, Long> {

}
