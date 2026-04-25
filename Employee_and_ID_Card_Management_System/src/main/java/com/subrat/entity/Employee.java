package com.subrat.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
public class Employee {
	@Id
	@SequenceGenerator(name="gen2",sequenceName = "e_id",initialValue = 100,allocationSize = 1)
	@GeneratedValue(generator = "gen2",strategy = GenerationType.SEQUENCE)
	private Long id;
	@NonNull
	private String employeeName;
	@NonNull
	private String department;
	@NonNull
	private Double salary;
	@OneToOne(targetEntity =IdCard.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="empl_id",referencedColumnName = "id")
	private IdCard idcard;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", department=" + department + ", salary="
				+ salary + ", idcard=" + idcard + "]";
	}
	
	
}
