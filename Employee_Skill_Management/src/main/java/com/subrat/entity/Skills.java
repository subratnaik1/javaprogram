package com.subrat.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
public class Skills {
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "emmm",initialValue = 100,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Long skillId;
	@NonNull
	private String skillName;
	@ManyToMany(targetEntity = Employee.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "skills")
	private List<Employee>employees;
	@Override
	public String toString() {
		return "Skills [skillId=" + skillId + ", skillName=" + skillName + "]";
	}
	
}
