package com.subrat.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subrat.entity.Course;

public interface Icourse extends JpaRepository<Course, Long	> {

}
