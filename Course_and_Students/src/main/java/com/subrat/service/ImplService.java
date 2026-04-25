package com.subrat.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subrat.entity.Course;
import com.subrat.entity.Student;
import com.subrat.repositary.Icourse;
import com.subrat.repositary.Istudent;

@Service
public class ImplService implements Iservice {
	@Autowired
	private Icourse Crepo;
	@Autowired
	private Istudent Srepo;
	@Override
	public List<Course> addCources(List<Course> c) {
		
		return Crepo.saveAll(c);
	}
	@Override
	public List<Student> viewStudent() {
		
		return Srepo.findAll();
	}
	@Override
	public Optional<Course> searchCourseById(Long id) {
		
		return Crepo.findById(id);
	}
}
