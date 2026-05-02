package com.subrat.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subrat.entity.PatientRecord;

public interface PatientRepos extends JpaRepository<PatientRecord, Long> {

}
