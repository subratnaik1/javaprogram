package com.subrat.service;

import java.util.List;
import java.util.Optional;

import com.subrat.entity.Course;
import com.subrat.entity.Student;

public interface Iservice {
	List<Course> addCources(List<Course> c);

	List<Student> viewStudent();

	Optional<Course> searchCourseById(Long id);
}
