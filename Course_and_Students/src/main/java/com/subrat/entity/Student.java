package com.subrat.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter
public class Student {
	@Id
	@SequenceGenerator(name = "gen2", sequenceName = "e_id", initialValue = 100, allocationSize = 1)
	@GeneratedValue(generator = "gen2", strategy = GenerationType.SEQUENCE)
	private Long id;
	@NonNull
	private String studentName;
	@NonNull
	private String email;
	@ManyToOne(targetEntity = Course.class,fetch = FetchType.EAGER)
	@JoinColumn(name=" sid",referencedColumnName = "id")
	private Course course;
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", email=" + email + ", course=" + course + "]";
	}
	
}
