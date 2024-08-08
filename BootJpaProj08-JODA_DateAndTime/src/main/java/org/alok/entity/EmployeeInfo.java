package org.alok.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name="JPA_EMPLOYEE_INFO")
@NoArgsConstructor
@RequiredArgsConstructor
public class EmployeeInfo {

	@Id
	@SequenceGenerator(name="E1" ,initialValue = 1000,allocationSize = 1,sequenceName = "EMP_SEQ")
	@GeneratedValue(generator = "E1",strategy = GenerationType.SEQUENCE)
	private Integer eid;
	@NonNull
	private String ename;
	@NonNull
	private String addr;
	@NonNull
	private String desg;
	@NonNull
	private LocalDateTime dob;
	@NonNull
	private LocalTime toj;
	@NonNull
	private LocalDate doj;
	
}
