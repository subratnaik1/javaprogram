package com.subrat.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subrat.entity.Student;

public interface Istudent extends JpaRepository<Student, Long> {

}
