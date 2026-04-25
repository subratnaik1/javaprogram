package com.subrat.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class Course {
	@Id
	@SequenceGenerator(name = "gen2", sequenceName = "e_id", initialValue = 100, allocationSize = 1)
	@GeneratedValue(generator = "gen2", strategy = GenerationType.SEQUENCE)
	private Long id;
	@NonNull
	private String courseName;
	@NonNull
	private Long duration;
	@OneToMany(targetEntity = Student.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "course")
	private List<Student> students;
	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", duration=" + duration + ", students=" + students
				+ "]";
	}

}
