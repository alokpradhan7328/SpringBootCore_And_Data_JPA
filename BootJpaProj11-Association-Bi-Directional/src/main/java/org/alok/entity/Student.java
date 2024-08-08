package org.alok.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="JPA_STUDENT")
@Setter
@Getter
@RequiredArgsConstructor
public class Student {
	
	@Id
	@SequenceGenerator(name="S1",initialValue = 11,allocationSize = 1,sequenceName = "OTM_STUDENT")
	@GeneratedValue(generator ="S1",strategy = GenerationType.SEQUENCE)
	private Integer sid;
	@Nonnull
	@Column(length=20)
	private String sname;
	@Nonnull
	@Column(length=20)
	private String gender;
	@Nonnull
	@Column(length=20)
	private String city;
	@Nonnull
	@Column(length=20)
	private String dept;
	@Nonnull
	private float marks;
	
	@ManyToOne(targetEntity = College.class,cascade = CascadeType.ALL)
	@JoinColumn(name="COLLEGE_ID",referencedColumnName = "CID")
	private College college;
	
	public Student() 
	{
		System.out.println("Student::0-Param Constructor");
		
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", gender=" + gender + ", city=" + city + ", dept=" + dept
				+ ", marks=" + marks + "]";
	}
	

	
	
	
	
	

}
