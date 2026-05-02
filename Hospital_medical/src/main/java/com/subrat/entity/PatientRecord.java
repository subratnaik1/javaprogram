package com.subrat.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NonNull;
@Entity
@Data
@Table(name="pat_1")
public class PatientRecord {
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "emmm",initialValue = 100,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Long recordId;
	@NonNull
	private String patientName;
	@Lob
	private byte[] medicalReport;
	@Lob
	private String diagnosis;
}
