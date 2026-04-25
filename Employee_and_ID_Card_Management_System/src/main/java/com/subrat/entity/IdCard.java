package com.subrat.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class IdCard {
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "icar_id",initialValue = 100,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Long id;
	@NonNull
	private Long cardNumber;
	@NonNull
	private String cardType;
	@NonNull
	private String accessLevel;
	@NonNull
	private String issuedBy;
	@Override
	public String toString() {
		return "IdCard [id=" + id + ", cardNumber=" + cardNumber + ", cardType=" + cardType + ", accessLevel="
				+ accessLevel + ", issuedBy=" + issuedBy + "]";
	}
	
}
