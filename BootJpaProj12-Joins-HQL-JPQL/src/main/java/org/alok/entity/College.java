package org.alok.entity;

import java.util.Set;

import jakarta.annotation.Nonnull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="JPA_OTM_COLLEGE")
@RequiredArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class College 
{

	@Id
	@SequenceGenerator(name="C1",initialValue = 100,allocationSize = 1,sequenceName = "JPA_CLG")
	@GeneratedValue(generator = "C1",strategy = GenerationType.SEQUENCE)
	private Integer cid;
	
	@Nonnull
	@Column(length=20)
	private String cname;
	@Nonnull
	@Column(length=20)
	private String addrs;
	@Nonnull
	@Column(length=20)
	private Double fees;
	@Nonnull
	private Long contactNo;
	
	
	@OneToMany(targetEntity = Student.class,cascade = CascadeType.ALL,mappedBy = "college",fetch = FetchType.EAGER)//CascadeType.ALL if any non-select operation perform any table the upadation will be effect on assocated tables
	//@JoinColumn(name="COLLEGE_ID",referencedColumnName = "CID")//fk column info
	private Set<Student> studentDetails;
	
	public College() 
	{
		System.out.println("College::0-ParamConstructor");	
	}

	@Override
	public String toString() {
		return "College [cid=" + cid + ", cname=" + cname + ", addrs=" + addrs + ", fees=" + fees + ", contactNo="
				+ contactNo + "]";
	}

	
	
	
}
