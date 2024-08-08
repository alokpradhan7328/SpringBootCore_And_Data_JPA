package org.alok.entity;

import java.io.Serializable;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name="JPA_JOBSEEKER")
@AllArgsConstructor
@RequiredArgsConstructor
public class JobSeeker implements Serializable	
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer jobId;
	
	@NonNull
	private String name;
	
	@NonNull
	private String addr;
	
	@NonNull
	private boolean isIndian;
	
	@Lob
	@NonNull
	@Column(length=2000)
	private byte[] photos;
	
	@Lob
	@NonNull
	@Column(length=2000)
	private char[] resume;
}
